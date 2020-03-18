def call(String projectID){
   def jacocoPath = 'tools/jacoco'
   bat "if not exist \"${jacocoPath}\" mkdir \"${jacocoPath}\""
   bat "curl \"https://oss.sonatype.org/service/local/artifact/maven/redirect?r=snapshots&g=org.jacoco&a=jacoco&e=zip&v=LATEST\" -L -o ${jacocoPath}/jacoco.zip"
   bat "tar -xf ${jacocoPath}/jacoco.zip -C ${jacocoPath}"
   
   bat "mvn org.apache.maven.plugins:maven-resources-plugin:resources"
   bat "mvn org.apache.maven.plugins:maven-compiler-plugin:compile"
   bat "mvn org.apache.maven.plugins:maven-resources-plugin:testResources"
   bat "mvn org.apache.maven.plugins:maven-compiler-plugin:testCompile"
   bat "mvn org.apache.maven.plugins:maven-surefire-plugin:test -DargLine=\"-javaagent:'%cd%\\tools\\jacoco\\lib\\jacocoagent.jar'=destfile=target\\jacoco.exec -Xmx128m\""
   
   jacoco(
      //changeBuildStatus: true,
      //minimumLineCoverage: '70',
      //maximumLineCoverage: '80'
   )
}