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
#java -Xms4096m -Xmx12288m -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/yosu/Projects/STAMP/Git/dhell/dspot_dump.bin -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 2 --test all -a MethodAdd:AllLiteralAmplifiers:MethodGeneratorAmplifier -s JacocoCoverageSelector --verbose --clean 2>&1 | tee -a $traceFile
java -Xms4096m -Xmx12288m -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/yosu/Projects/STAMP/Git/dhell/dspot_dump.bin -XX:+UseLinuxPosixThreadCPUClocks -agentpath:/home/yosu/Development/netbeans/profiler/lib/deployed/jdk16/linux-amd64/libprofilerinterface.so=/home/yosu/Development/netbeans/profiler/lib,5140 -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 3 --test eu.stamp_project.examples.dhell.HelloAppTest -a MethodAdd:AllLiteralAmplifiers:MethodGeneratorAmplifier --verbose --clean 2>&1 | tee -a $traceFile
