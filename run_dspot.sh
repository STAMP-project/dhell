#!/bin/sh
################################################################################

# get dspot jar
wget -nc https://github.com/STAMP-project/dspot/releases/download/dspot-2.2.1/dspot-2.2.1-jar-with-dependencies.jar
dspotJar=`ls *dependencies.jar`
dspotPropertiesFile="dhell.dspot"

traceFile="dspot.traces"

echo "java -jar $dspotJar --path-to-properties $dspotPropertiesFile --generate-new-test-class -i 3 --test all -a MethodDuplicationAmplifier,MethodRemove,FastLiteralAmplifier,MethodAdderOnExistingObjectsAmplifier,ReturnValueAmplifier,StringLiteralAmplifier,NumberLiteralAmplifier,BooleanLiteralAmplifier,CharLiteralAmplifier,AllLiteralAmplifiers,NullifierAmplifier,ArrayAmplifier --verbose" 2>&1 | tee $traceFile
echo "--------------------------------------------------------------------------------" >>  $traceFile
java -jar $dspotJar --path-to-properties $dspotPropertiesFile --generate-new-test-class -i 3 --test all -s JacocoCoverageSelector -a MethodDuplicationAmplifier:MethodRemove:FastLiteralAmplifier:MethodAdderOnExistingObjectsAmplifier:ReturnValueAmplifier:StringLiteralAmplifier:NumberLiteralAmplifier:BooleanLiteralAmplifier:CharLiteralAmplifier:AllLiteralAmplifiers:NullifierAmplifier:ArrayAmplifier --verbose 2>&1 | tee -a $traceFile
