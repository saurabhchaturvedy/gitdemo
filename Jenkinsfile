node{
stage('Checkout')
{
git 'https://github.com/saurabhchaturvedy/gitdemo'
}

stage('Compile-package')
{
def mvnHome = tool name: 'maven-app', type: 'maven'
  bat "${mvnHome}/bin/mvn package"
}
}
