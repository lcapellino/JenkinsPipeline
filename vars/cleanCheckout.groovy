def call(String gitRepo, String gitCredential){

   if (!gitRepo.find()) {
      error("Nothing to pull. Did you forgot to enter a repository as paramater?")
   }

   echo "Starting clean and Checkout..."

   deleteDir()
   git url: "${gitRepo}", credentialsId: "${gitCredential}"
}