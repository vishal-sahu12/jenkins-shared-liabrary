def call(){
    echo "This is code push file"
    withCredentials([usernamePassword(
        credentialsId: 'Github',
        usernameVariable: 'gitUser',
        passwordVariable: 'gitPass'
    )]) {
        sh '''
            echo "Checking repository status:"
            git status

            echo "Adding changes:"
            git add .

            echo "Committing changes:"
            git commit -m "Updated environment variables"

            echo "Pushing to GitHub:"
            git push https://vishal-sahu12:${gitPass}@github.com/vishal-sahu12/Wanderlust-Mega-Project.git main
        '''
    }
}