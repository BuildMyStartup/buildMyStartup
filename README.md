# BuildMyStartup Project Setup:

1. Install Java 1.7 or higher
2. Install Maven 3 or higher
3. Set-up a Github account if you dont already have one and send request for access to saif.rizvi@gmail.com 
4. Pull the project from github from the following location: https://github.com/BuildMyStartup/buildMyStartup.git
5. Go to project root folder on the command line and build using the following maven command  
$> mvn clean install
6. Run the project using the following maven command  
$> mvn jetty:run
7. Go to your browser and run the application at - http://localhost:8080/buildmystartup/welcome

# How to make changes to the repository

### 1. Create a new branch
1. Commit your changes to feature_xyz branch  
2. Push your changes to remote (origin/feature_xyz)  
3. Repeat steps 1 and 2 until your feature is complete. It is a good practice to commit small changes often.  
  
### 2. Create a Pull Request
A pull request is a way to open a discussion on the changes that you want to merge to master.  
  
1. Go to the project page and select "branches" from the tab above the project tree, or go directly to https://github.com/BuildMyStartup/buildmystartup/branches  
2. Click the "New Pull Request" button next to your branch name  
3. Review your Pull Request and assign it to someone for a peer review  
4. Make further commits and push them to remote as required by code review comments. The Pull Request will automatically update to show your new changes.

### 3. Review and Merge
1. Go to https://github.com/BuildMyStartup/buildmystartup/pulls to see a list of Pull Requests awaiting review
2. Comment on changes to start a discussion
3. Once all further changes have been committed and pushed, the reviewer should merge and delete the branch. These operations can be performed straight off the bottom of the pull request page.
