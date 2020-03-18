@Library('securitycheckpipeline') _ 

pipeline {
   	agent any

	tools{
		maven 'maven'
	}
	
   	stages {
      	stage('clean & pull') {
         	steps {
            	cleanCheckout("${gitRepo}" ,"${gitCredential}")
        	}
    	}
		/*
    	stage('Check Dependencies') {
         	steps {
            	dependencyTrack "${dependencyTrackProjectID}" 
        	}
    	}
    	stage('Unit Tests and Coverage') {
         	steps {
            	jUnitTests "${projectID}" 
        	}
    	}*/
	}
}