#!/bin/sh
################################################################################

# get dspot jar
#wget -nc https://github.com/STAMP-project/dspot/releases/download/dspot-1.2.1/dspot-1.2.1-jar-with-dependencies.jar
#dspotJar=`ls *dependencies.jar`
dspotJar=`ls ../dspot/dspot/target/*dependencies.jar`
dspotPropertiesFile="dhell.dspot"

traceFile="dspot.traces"

#echo "java -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 1 --test eu.stamp_project.examples.dhell.HelloAppTest -a MethodAdd --verbose" 2>&1 | tee $traceFile
#echo "--------------------------------------------------------------------------------" >>  $traceFile
java -Xms2048m -Xmx4096m -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/yosu/Projects/STAMP/Git/dhell/dspot_dump.bin -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 1 --test eu.stamp_project.examples.dhell.JUnit5_HelloAppTest -a MethodAdd -s JacocoCoverageSelector --clean 2>&1 | tee -a $traceFile
