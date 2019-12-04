properties([parameters([choice(choices: ['master', 'feature1', 'feature2'], description: '', name: 'branch')])])
properties([parameters([string(defaultValue: 'Just For Fun', description: '', name: 'Reason For  Build', trim: false)])])
node{
stage('Checkout')
{
  echo 'Pulling changes from branch ${params.branch}...'
  git url: 'https://github.com/saurabhchaturvedy/gitdemo', branch: "${params.branch}"
}

stage('Compile-package')
{
def mvnHome = tool name: 'maven-app', type: 'maven'
  bat "${mvnHome}/bin/mvn package"
}
}
