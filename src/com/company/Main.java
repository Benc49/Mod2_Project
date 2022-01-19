package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {
    static Integer level = 1;
    static Integer xp = 0;
    static Integer pts = 10;
    static String bait = "";

    static void levelUp() {
        if (level == 1 && xp >= 30) {
            xp = 0;
            level++;
            pts += 10;
        } else if (level == 2 && xp >= 50) {
            xp = 0;
            level++;
            pts += 20;
        }else if(level == 3 && xp >= 100){
            xp = 0;
            level++;
        }
    }

    static void game() {

        if (level == 1) {
            System.out.println("You are now at Granny's Pond");
            while (true) {
                if (xp >= 30) {
                    System.out.println("Would you like to go to Big ol' Lake?");
                    System.out.println("Type a to go");
                    System.out.println("Type b to stay at Granny's Pond");
                    Scanner leave = new Scanner(System.in);
                    String travel = leave.nextLine();
                    if (travel.equals("a")) {
                        levelUp();
                        break;
                    } else {
                        System.out.println("You stayed at Granny's Pond");
                        xp = 0;
                    }
                }


                System.out.println("Press a to cast your line");
                System.out.println("Press b to go back to the shop");
                Scanner choice = new Scanner(System.in);
                String decision = choice.nextLine();
                if (decision.equals("a")) {
                    System.out.println(xp);
                    System.out.println("You have a bite");
                    System.out.println("Press a to reel");
                    Scanner choice2 = new Scanner(System.in);
                    String decision2 = choice.nextLine();
                    if (decision2.equals("a")) {
                        if (level < 2) {
                            if (bait.equals("Worms")) {
                                String[] fish1 = {"Boot", "Bass", "Brim"};
                                Random rand = new Random();
                                int upperbound = 2;
                                int int_random = rand.nextInt(upperbound);
                                if (int_random == 0) {
                                    xp += 3;
                                    System.out.println("You caught a " + fish1[int_random]);
                                    System.out.println("+3xp");
                                } else if (int_random == 1) {
                                    xp += 10;
                                    System.out.println("You caught a " + fish1[int_random]);
                                    System.out.println("+10xp");
                                } else if (int_random == 2) {
                                    xp += 15;
                                    System.out.println("You caught a " + fish1[int_random]);
                                    System.out.println("+15xp");
                                } else {
                                    System.out.println("The fish got away");
                                }
                            } else if (bait.equals("Minos")) {
                                String[] fish2 = {"Boot", "Bass", "Brim", "Gar", "Croppie"};
                                Random rand = new Random();
                                int upperbound = 5;
                                int int_random = rand.nextInt(upperbound);
                                System.out.println(fish2[int_random]);
                                if (int_random == 1) {
                                    xp += 3;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+3xp");
                                } else if (int_random == 2) {
                                    xp += 10;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+10xp");
                                } else if (int_random == 3) {
                                    xp += 15;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+15xp");
                                } else if (int_random == 4) {
                                    xp += 20;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+20xp");
                                } else if (int_random == 5) {
                                    xp += 20;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+20xp");
                                } else {
                                    System.out.println("The fish got away");
                                }
                            }
                        }
                    }

                } else if (decision.equals("b")) {
                    store();
                }
            }
        }
        if (level == 2) {
            System.out.println("You are now at the Big ol' Lake");
            while (true) {
                if (xp >= 50) {
                    System.out.println("Would you like to go to The Deep Blue?");
                    System.out.println("Type a to go");
                    System.out.println("Type b to stay at The Big ol' Lake");
                    Scanner leave = new Scanner(System.in);
                    String travel = leave.nextLine();
                    if (travel.equals("a")) {
                        levelUp();
                        break;
                    } else {
                        System.out.println("You stayed at The Big ol' Lake");
                        xp = 0;
                    }
                }


                System.out.println("Press a to cast your line");
                System.out.println("Press b to go back to the shop");
                Scanner choice = new Scanner(System.in);
                String decision = choice.nextLine();
                if (decision.equals("a")) {
                    System.out.println(xp);
                    System.out.println("You have a bite");
                    System.out.println("Press a to reel");
                    Scanner choice2 = new Scanner(System.in);
                    String decision2 = choice.nextLine();
                    if (decision2.equals("a")) {
                        if (level == 2) {
                            if (bait.equals("Worms")) {
                                String[] fish1 = {"Bass", "Brim"};
                                Random rand = new Random();
                                int upperbound = 2;
                                int int_random = rand.nextInt(upperbound);
                                if (int_random == 0) {
                                    xp += 3;
                                    System.out.println("You caught a " + fish1[int_random]);
                                    System.out.println("+15xp");
                                } else if (int_random == 1) {
                                    xp += 10;
                                    System.out.println("You caught a " + fish1[int_random]);
                                    System.out.println("+20xp");
                                } else {
                                    System.out.println("The fish got away");
                                }
                            } else if (bait.equals("Minos")) {
                                String[] fish2 = {"Bass", "Brim", "Gar", "Croppie"};
                                Random rand = new Random();
                                int upperbound = 4;
                                int int_random = rand.nextInt(upperbound);
                                System.out.println(fish2[int_random]);
                                if (int_random == 1) {
                                    xp += 10;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+10xp");
                                } else if (int_random == 2) {
                                    xp += 15;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+15xp");
                                } else if (int_random == 3) {
                                    xp += 20;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+20xp");
                                } else if (int_random == 4) {
                                    xp += 20;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+20xp");
                                } else {
                                    System.out.println("The fish got away");
                                }
                            } else if (bait.equals("LUCKY LURE")) {
                                String[] fish = {"Bass", "Brim", "Gar", "Croppie"};
                                Random rand = new Random();
                                int upperbound = 4;
                                int int_random = rand.nextInt(upperbound);
                                System.out.println(fish[int_random]);
                                if (int_random == 1) {
                                    xp += 10;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+10xp");
                                } else if (int_random == 2) {
                                    xp += 15;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+15xp");
                                } else if (int_random == 3) {
                                    xp += 20;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+20xp");
                                } else if (int_random == 4) {
                                    xp += 20;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+20xp");
                                } else {
                                    System.out.println("The Fish got away");
                                }

                            }
                        }


                    }
                    }else if (decision.equals("b")) {
                    store();
                }
            }
        }
        if (level == 3) {
            System.out.println("You are now at The Deep Blue");
            while (true) {
                if (xp >= 100) {
                    System.out.println("Would you like to go to finish the game");
                    System.out.println("Type a to go");
                    System.out.println("Type b to stay at The Deep Blue");
                    Scanner leave = new Scanner(System.in);
                    String travel = leave.nextLine();
                    if (travel.equals("a")) {
                        levelUp();
                        break;
                    } else {
                        System.out.println("You stayed at The Deep Blue");
                        xp = 0;
                    }
                }
                System.out.println("Press a to cast your line");
                System.out.println("Press b to go back to the shop");
                Scanner choice = new Scanner(System.in);
                String decision = choice.nextLine();
                    if (decision.equals("a")) {
                        System.out.println(xp);
                        System.out.println("You have a bite");
                        System.out.println("Press a to reel");
                        Scanner choice2 = new Scanner(System.in);
                        String decision2 = choice.nextLine();
                        if (decision2.equals("a")) {
                            if (bait.equals("Worms")) {
                                String[] fish1 = {"Reef"};
                                Random rand = new Random();
                                int upperbound = 1;
                                int int_random = rand.nextInt(upperbound);
                                if (int_random == 0) {
                                    xp += 2;
                                    System.out.println("You caught a " + fish1[int_random]);
                                    System.out.println("+2xp");}
                                    else {
                                    System.out.println("The fish got away");
                            }
                            }else if (bait.equals("Minos")) {
                                String[] fish2 = {"Star fish"};
                                Random rand = new Random();
                                int upperbound = 1;
                                int int_random = rand.nextInt(upperbound);
                                System.out.println(fish2[int_random]);
                                if (int_random == 0) {
                                    xp += 10;
                                    System.out.println("You caught a " + fish2[int_random]);
                                    System.out.println("+10xp");
                                } else {
                                    System.out.println("The fish got away");
                                }
                            } else if (bait.equals("LUCKY LURE")) {
                                String[] fish = {"Trout", "Red Snapper", "Starfish"};
                                Random rand = new Random();
                                int upperbound = 3;
                                int int_random = rand.nextInt(upperbound);
                                System.out.println(fish[int_random]);
                                if (int_random == 1) {
                                    xp += 20;
                                    pts += 15;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+10xp");
                                } else if (int_random == 2) {
                                    xp += 25;
                                    pts += 10;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+15xp");
                                } else if (int_random == 3) {
                                    xp += 2;
                                    pts += 1;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+20xp");
                                } else {
                                    System.out.println("The Fish got away");
                                }
                            } else if (bait.equals("Steak")) {
                                String[] fish = {"Shark", "Swordfish", "Red Snapper", "Grouper"};
                                Random rand = new Random();
                                int upperbound = 5;
                                int int_random = rand.nextInt(upperbound);
                                System.out.println(fish[int_random]);
                                if (int_random == 0) {
                                    xp += 20;
                                    pts += 15;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+10xp");
                                } else if (int_random == 1) {
                                    xp += 15;
                                    pts += 25;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+15xp");
                                } else if (int_random == 2) {
                                    xp += 20;
                                    pts += 15;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+20xp");
                                } else if (int_random == 3) {
                                    xp += 20;
                                    pts += 5;
                                    System.out.println("You caught a " + fish[int_random]);
                                    System.out.println("+20xp");
                                } else {
                                    System.out.println("The Fish got away");
                                }

                                }

                        }
                        }else if (decision.equals("b")) {
                        store();
                    }
                }
            }
        }
    static String store() {
        Main myObj = new Main();
        System.out.println("Welcome to the store, Your store will upgrade the higher level you are");
        System.out.println("Lvl " + level);
        System.out.println("You have " + pts + "pts");

        if (level == 1) {
            System.out.println("What would you like to purchase?");
            System.out.println("1.Worms: 5pts");
            System.out.println("2.Minos: 7pts");
            System.out.println("3.Nothing");

            Scanner pick = new Scanner(System.in);
            String baits = pick.nextLine();
            if (baits.equals("1")) {
                if (pts - 5 < 0) {
                    System.out.println("You do not have enough points to buy this!");
                } else {
                    bait = "Worms";
                    pts -= 5;
                    System.out.println("You chose " + bait);
                }
            } else if (baits.equals("2")) {
                if (pts - 7 < 0) {
                    System.out.println("You do not have enough points to buy this!");
                }
                bait = "Minos";
                pts -= 7;
                System.out.println("You chose " + bait);

            } else if (baits.equals("3")) {
                System.out.println("You chose nothing");

            }
        } else if (level == 2) {
            System.out.println("What would you like to purchase?");
            System.out.println("1.Worms: 5pts");
            System.out.println("2.Minos: 7pts");
            System.out.println("3.LUCKY LURE: 15pts");
            System.out.println("4.Nothing");

            Scanner pick = new Scanner(System.in);
            String baits = pick.nextLine();
            if (baits.equals("1")) {
                if (pts - 5 < 0) {
                    System.out.println("You do not have enough points to buy this!");
                } else {
                    bait = "Worms";
                    pts -= 5;
                    System.out.println("You chose " + bait);
                }
            } else if (baits.equals("2")) {
                if (pts - 7 < 0) {
                    System.out.println("You do not have enough points to buy this!");
                } else{
                    bait = "Minos";
                pts -= 7;
                System.out.println("You chose " + bait);
            }
            } else if (baits.equals("3")) {
                if (pts - 7 < 0) {
                    System.out.println("You do not have enough points to buy this!");
                } else {
                    bait = "LUCKY LURE";
                    pts -= 15;
                    System.out.println("You chose the " + bait);
                }
            }
        } else if (level == 3) {
            System.out.println("What would you like to purchase?");
            System.out.println("1.Worms: 5pts");
            System.out.println("2.Minos: 7pts");
            System.out.println("3.LUCKY LURE: 15pts");
            System.out.println("4.Steak: 50pts");
            System.out.println("5.Nothing");

            Scanner pick = new Scanner(System.in);
            String baits = pick.nextLine();
            if (baits.equals("1")) {
                if (pts - 5 < 0) {
                    System.out.println("You do not have enough points to buy this!");
                } else {
                    bait = "Worms";
                    pts -= 5;
                    System.out.println("You chose " + bait);
                }
            } else if (baits.equals("2")) {
                if (pts - 7 < 0) {
                    System.out.println("You do not have enough points to buy this!");
                }else{
                bait = "Minos";
                pts -= 7;
                System.out.println("You chose " + bait);
                }

            } else if (baits.equals("3")) {
                if (pts - 15 < 0) {
                    System.out.println("You chose " + bait);
                }else {
                    bait = "LUCKY LURE";
                    pts -= 15;
                    System.out.println("You chose the " + bait);
                }

                } else if (baits.equals("4")) {
                    if (pts - 50 < 0) {
                        System.out.println("You do not have enough points to buy this!");
                    } else {
                        bait = "Steak";
                        pts -= 50;
                        System.out.println("You chose " + bait);
                    }
                }
            }
        return bait;
        }



        public static void main (String[]args){
            System.out.println("Welcome to the fishing simulator. You are here to catch fish, travel and level up. Press a to buy some bait");
            Scanner start = new Scanner(System.in);
            String intro = start.nextLine();
            if (intro.equals("a")) {
                store();
                System.out.println("When you are ready to start. Type a");
                Scanner level_one = new Scanner(System.in);
                String level1 = level_one.nextLine();
                if (level1.equals("a")) {
                    game();
                }
            }
        }
    }

