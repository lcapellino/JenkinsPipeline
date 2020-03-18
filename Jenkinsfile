@Library('securitycheckpipeline') _ 

pipeline {
   	agent any

	tools{
		maven 'maven-3.6.2'
	}
	
   	stages {
      	stage('clean & pull') {
         	steps {
            	cleanCheckout("${gitRepo}" ,"${gitCredential}")
        	}
    	}
    	stage('Check Dependencies') {
         	steps {
            	dependencyTrack "${dependencyTrackProjectID}" 
        	}
    	}
    	stage('Unit Tests and Coverage') {
         	steps {
            	jUnitTests "${projectID}" 
        	}
    	}
	}
}