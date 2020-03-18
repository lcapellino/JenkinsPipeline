@Library('securitycheckpipeline') _ 

pipeline {
   	agent any

	tools{
		maven 'maven'
		jdk 'jdk8'
	}
	
   	stages {
      	stage('clean & pull') {
         	steps {
            	cleanCheckout("${gitRepo}" ,"${gitCredential}")
        	}
    	}
		stage('Compile') {
         	steps {
            	bat 'mvn compile'
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