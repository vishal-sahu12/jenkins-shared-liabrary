def call(){
    echo "This is code push file"
    withCredentials([usernamePassword(
                    credentialsId:'Github',
                   gitToolName: 'Default'
                    )]){
               sh '''
                        echo "Checking repository status: "
                        git status
                    
                        echo "Adding changes to git: "
                        git add .
                        
                        echo "Commiting changes: "
                        git commit -m "Updated environment variables"
                        
                        echo "Pushing changes to github: "
                        git push https://github.com/vishal-sahu12/Wanderlust-Mega-Project.git main
                    '''
              
}

}