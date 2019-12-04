properties([parameters([choice(choices: ['master', 'feature1', 'feature2'], description: '', name: 'branch')])])
node{
stage('Checkout')
{
  echo 'Starting to checkout code from repository...'
git 'https://github.com/saurabhchaturvedy/gitdemo'
}

stage('Compile-package')
{
def mvnHome = tool name: 'maven-app', type: 'maven'
  bat "${mvnHome}/bin/mvn package"
}
}
