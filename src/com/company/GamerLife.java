package com.company;

public class GamerLife {

    private static int id;
    private String fullname;
    private String username;
    private String playerTier;
    private boolean subsciptionType;
    private int gamepoints;
    private int readyCoins;
    private int eliteCoins;

    public static void setId(int id) {
        GamerLife.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPlayerTier(String playerTier) {
        this.playerTier = playerTier;
    }

    public void setSubsciptionType(boolean subsciptionType) {
        this.subsciptionType = subsciptionType;
    }

    public void setGamepoints(int gamepoints) {
        this.gamepoints = gamepoints;
    }

    public void setReadyCoins(int readyCoins) {
        this.readyCoins = readyCoins;
    }

    public void setEliteCoins(int eliteCoins) {
        this.eliteCoins = eliteCoins;
    }

    public int getEliteCoins() {
        return eliteCoins;
    }

    private static int counter;

    public int getReadyCoins() {
        return readyCoins;
    }

    public static int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPlayerTier() {
        return playerTier;
    }

    public boolean isSubsciptionType() {
        return subsciptionType;
    }

    public int getGamepoints() {
        return gamepoints;
    }

    public String usernameCreator() {
        return ("@" + ++counter);
    }

//    public GamerLife(String fullname, String username, String playerTier, boolean subsciptionType, int gamepoints) {
//        this.fullname = fullname;
//        this.username = username;
//        this.playerTier = playerTier;
//        this.subsciptionType = subsciptionType;
//        this.gamepoints = gamepoints;
//    }
    public void Showinfo()
    {
        System.out.println("Name: " + this.fullname);
        System.out.println("Username: " + this.username);
        System.out.println("SubscriptionType:: " + this.subsciptionType);
        System.out.println("GamePoints: " + this.gamepoints);
        System.out.println("PlayerTier:" + this.playerTier);
        System.out.println("ReadyCoins:" + this.readyCoins);
    }
    public String PlayerTierTracker(int gamerPoints) {
        if (gamerPoints >= 0 && gamerPoints <= 999) {
            System.out.println("Bronze Tier");
        } else if (gamerPoints >= 1000 && gamerPoints <= 1999) {
            System.out.println("Silver Tier");
        } else if (gamerPoints >= 2000 && gamerPoints <= 2999) {
            System.out.println("Gold Tier");
        } else if (gamerPoints >= 3000 && gamerPoints <= 3999) {
            System.out.println("Diamond Tier");
        } else if (gamerPoints >= 4000) {
            System.out.println("Platinum Tier");
        }
    };

    public boolean buyEliteCoins(boolean subscriptionType;) {
        if (subscriptionType == true) {
            System.out.println("SubsciptionType: Elite Subscription");

        } else (subscriptionType == false) {
            System.out.println("SubscriptionType: Ready Subscription");

        }



    };