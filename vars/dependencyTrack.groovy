def call(String projectID){
   
   bat "mvn org.cyclonedx:cyclonedx-maven-plugin:makeBom"
   dependencyTrackPublisher artifact: 'target/bom.xml', artifactType: 'bom', projectId: "${dependencyTrackProjectID}", synchronous: true, failedTotalCritical: 0
}