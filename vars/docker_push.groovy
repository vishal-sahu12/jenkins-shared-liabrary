def call (String ImageName,String Version){
withCredentials([usernamePassword(
                    credentialsId:"credential",
                    usernameVariable:"dockerHubUser", 
                    passwordVariable:"dockerHubPass"
                    )]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${env.dockerHubUser}/${ImageName}:${Version}"
}
}
