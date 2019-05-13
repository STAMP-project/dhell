#!/bin/sh
################################################################################

# get dspot jar
#wget -nc https://github.com/STAMP-project/dspot/releases/download/dspot-1.2.1/dspot-1.2.1-jar-with-dependencies.jar
#dspotJar=`ls *dependencies.jar`
dspotJar=`ls ../dspot-yosu/dspot/target/*dependencies.jar`
dspotPropertiesFile="dhell.dspot"

traceFile="dspot.traces"

echo "java -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 1 --test eu.stampproject.examples.dhell.HelloAppTest -a MethodAdd --verbose" 2>&1 | tee $traceFile
echo "--------------------------------------------------------------------------------" >>  $traceFile
java -Xms2048m -Xmx4096m -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 3 --test eu.stamp_project.examples.dhell.HelloAppTest -a MethodAdd -s JacocoCoverageSelector --verbose 2>&1 | tee -a $traceFile
