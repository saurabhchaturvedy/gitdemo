properties([parameters([choice(choices: ['master', 'feature1', 'feature2'], description: '', name: 'branch')])])
node{
stage('Checkout')
{
  echo 'Pulling changes from branch ${params.branch}...'
  git url 'https://github.com/saurabhchaturvedy/gitdemo', branch "${params.branch}"
}

stage('Compile-package')
{
def mvnHome = tool name: 'maven-app', type: 'maven'
  bat "${mvnHome}/bin/mvn package"
}
}
