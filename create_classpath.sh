mvn org.apache.maven.plugins:maven-dependency-plugin:copy-dependencies
mvn package
echo -n "./target/classes:./target/test-classes:" > workshop/Botsing/classpath.txt
for i in ./target/dependency/*.jar; do echo -n $i":"; done >> workshop/Botsing/classpath.txt
