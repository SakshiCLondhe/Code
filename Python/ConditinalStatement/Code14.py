PlayerList=["Rohit","Shubhaman","Virat","Ayyar","KLRahul"]
Player_Name=input(" Enter Player Name:");
for Player in PlayerList:
     if Player==Player_Name:
         print(Player_Name,"Present in List")
         break;
else:
        print(Player_Name,"Not Present in List")
