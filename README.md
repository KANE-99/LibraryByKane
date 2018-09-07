# LibraryByKane
  - Instructions About Android Studio
      - For the android code to work on your Studio: 
      1) Open the project containing the code. 
      2) Go to file->project structure.
      3) choose Project tab from left column. 
      4) Make sure to have the following properties: Gradle version : 4.1,Android plugins version:3.0.0 . 
      5) Android Plugin repository: maven {             url 'https://maven.google.com/'             name 'Google'         }, jcenter
      6) Default Library repository:maven {             url 'https://maven.google.com/'             name 'Google'         }, jcenter

Configure the gradle files(In gradle scripts Section of Project) as such: (open this link to view the code)
 https://gist.github.com/KANE-99/c9dde9f97f847a848458212f4fdfc8ea
 https://gist.github.com/KANE-99/210fec5d137a295278a0b8ad131bf778
 https://gist.github.com/KANE-99/1e04e9f3083012e46df21e1b903e9d0dipt>

Important: Change your database settings in the as per your JDBC. For Android app to work you also have to make changes to code where IP address (Note:Port doesn't have to be changed. No changes are required on javaFX for connectivity.) is written(In MessageSender class).For Connection, make sure you have both the PC and Android phone on which the app is running to be on same wifi network.Then check your IP address by opening cmd and type "ipconfig" and check under LAN WIFI (IPv4): as in my case 192.168.43.129.
