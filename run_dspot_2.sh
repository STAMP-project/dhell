#!/bin/sh
################################################################################

# get dspot jar
#wget -nc https://github.com/STAMP-project/dspot/releases/download/dspot-1.2.1/dspot-1.2.1-jar-with-dependencies.jar
#dspotJar=`ls *dependencies.jar`
dspotJar=`ls ../dspot-yosu/dspot/target/*dependencies.jar`
dspotPropertiesFile="dhell.dspot"

traceFile="dspot.traces"

#echo "java -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 1 --test eu.stamp_project.examples.dhell.HelloAppTest -a MethodAdd --verbose" 2>&1 | tee $traceFile
#echo "--------------------------------------------------------------------------------" >>  $traceFile
#java -Xms2048m -Xmx4096m -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/yosu/Projects/STAMP/Git/dhell/dspot_dump.bin -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 1 --test eu.stamp_project.examples.dhell.JUnit5_HelloAppTest -a MethodAdd -s JacocoCoverageSelector --use-maven-to-exe-test --execute-test-parallel-with-number-processors 5 --clean 2>&1 | tee -a $traceFile
java -Xms2048m -Xmx4096m -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/yosu/Projects/STAMP/Git/dhell/dspot_dump.bin -jar $dspotJar --path-to-properties $dspotPropertiesFile -i 3 --test eu.stamp_project.examples.dhell.HelloAppTest:eu.stamp_project.examples.dhell.MyStorageTest -a MethodDuplicationAmplifier:MethodRemove:FastLiteralAmplifier:TestDataMutator:MethodGeneratorAmplifier:MethodAdderOnExistingObjectsAmplifier:ReturnValueAmplifier:StringLiteralAmplifier:NumberLiteralAmplifier:BooleanLiteralAmplifier:CharLiteralAmplifier:AllLiteralAmplifiers:NullifierAmplifier -s JacocoCoverageSelector --clean 2>&1 | tee -a $traceFile
