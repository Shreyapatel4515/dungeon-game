import java.util.Scanner;

public class TD
{
		
	public static void main(String args[])
	{
//Game Starts	
	boolean playing = true;
        while (playing)
	 {
		System.out.println("Welcome to Text Dungeon!");
		System.out.println("Please press enter until you wake up.");

		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		String d = scan.nextLine();

		String A = scan.nextLine();
		String B = scan.nextLine();
		String C = scan.nextLine();
		String D = scan.nextLine();
		String value;
		

		
		System.out.println("");
//First Choice
			System.out.println("You wake up in a cold, dimly lit room.\nThere are six torches lighting the outline of four doorways.\nYou decide to enter one of these doorways. Which doorway will you enter?");
			System.out.println("");
			System.out.println(" A. North (Adventure) \n B. West(Action) \n C. East (horror) \n D. South (Suspense) \n\n Enter your Choice :");
			String door = scan.nextLine();
			System.out.println("");

		
		
//Choice Tree Option A
	if (door.equalsIgnoreCase("A"))
		{
		System.out.println("You enter the doorway to the North. The passageway smells of smoke.\nYou grab a torch and continue in.");
		System.out.println("");
		System.out.println("You enter a large cavern filled with lava.\nThere are stepping stones that make a path across the lava to the other side.\nTwo stones are in front of you: one to the left and one to the right.\nYou can choose the left or right stone to cross.");
				value = scan.nextLine();
				System.out.println("");
		if (value.equalsIgnoreCase("left"))
		{
		System.out.println("You leap towards the left stepping stone.\nUnfortunately, the stone is unstable and is unable to support your weight.\nYou slip from the stone, burn yourself, and die.");
		System.exit(0);
		}
			
			if (value.equalsIgnoreCase("right"))
			{
			System.out.println("You leap towards the right stepping stone. It's able to support your weight.\nYou look ahead and see more stepping stones to use to cross the lake of lava.\nHowever, to your right, you see a ledge that you can jump across to access another cavern.\nDo you leap to the left or right?");
			value = scan.nextLine();
			System.out.println("");	
			if (value.equalsIgnoreCase("left"))
				{
				System.out.println("You continue along the path of stepping stones.\nYou manage to make a couple of the leaps between stones, but on the last one the stone crumbles under your feet and you die agonizingly in the lake of fire.");
				System.exit(0);
				}

				if (value.equalsIgnoreCase("right"))
				{

				System.out.println("You leap to the ledge, and you are able to grab hold of it.\nYou pull yourself over the ledge and continue down to the passageway.\nThe passageway is dark, but with your torch you are able to see a gapping hole in the middle of the passageway.\nTo your right, there is a climbable ledge that can get you across the hole.\nHowever ahead of you there is a rope hanging from a ceiling.\nDo you go forward or to the right?");
				value = scan.nextLine();
				System.out.println("");
					if (value.equalsIgnoreCase("Forward"))

					{
					System.out.println("You run, leap towards the rope, and manage to swing to the other side.\nYou enter the next cavern where inside awaits a sleeping dragon.\nTo your right is a vast pile of gold, but you notice an old corpse to your left with a sword in its hand. Do you go to the left or right? ");
					value = scan.nextLine();
					System.out.println("");
						if (value.equalsIgnoreCase("Left"))
						{
						System.out.println("You carefully proceed to grab the sword. You know what must be done to ensure your saftey.\nYou plunge the sword into the dragons heart and dragon dies.\nBehind it, there is a passageway to the outside world.\n\nCongratulations! You slayed dragon and escaped the cavern.");
						System.exit(0);
						}
						if (value.equalsIgnoreCase("right"))
						{
						System.out.println("You quietly creep to the mound of gold. Along the way, your feet accidently hit a golden goblet on the floor. The noise is lound enough to wake the dragon.\nThe dragon gobbles you up and you die.");
						System.exit(0);
						}
					}
					if (value.equalsIgnoreCase("Right"))
					{
	
					System.out.println("You slowly slide across the ledge, but the footholds gives away.\nYou fall to your death.");
					System.exit(0);
					}

				}
			
			

//End of If statement for Choice Tree A
}
				}
//Choice Tree Option B
	if (door.equalsIgnoreCase("B"))
	{
	
	System.out.println( "WELCOME To My Action World");
			
	System.out.println("You enter the doorway to the West.\nYou wake up in a dark, unfamiliar surrounding.\nYou realize that you are in a forest and your phone is missing.\nBe ready to face anything");		
			
	System.out.println("Do you want to move further? (y/n)");
	door = scan.next();
	String Y = scan.nextLine();
	String y = scan.nextLine();
	String N = scan.nextLine();
	String n = scan.nextLine();		
			
			if (door.equalsIgnoreCase("y"))
			{
			System.out.println("The forest surrounds you in all directions:\n 1. Go to rest area \n 2. Explore the forest \n 3. Observe your surroundings ");
			System.out.println("Choose your option?");
			door = scan.next();
			
				if(door.equalsIgnoreCase("1"))
				{
				System.out.println("Do you want to go to rest area? (y/n)");
				door = scan.next();
				
					if(door.equalsIgnoreCase("y"))
					{
			 		System.out.println("You found a small wooden house.\nYou go inside and find a lion in there.\nYou fight with the lion and you die.\nGame Over!! Try Again");
			 		System.exit(0);
					}
				
					else if(door.equalsIgnoreCase("n"))
					{
					System.out.println("You found the thief who stole your phone.\nYou fight with him and get your phone back.\nYou call your friend and go home safely.");
					System.exit(0);
					}				
				}
 				if(door.equalsIgnoreCase("2"))
				{
				System.out.println("You are exploring the forest and hear the sound of animals.\nDo you want to move further?(y/n):");
				door = scan.next();
				
					if(door.equalsIgnoreCase("y"))
					{
					System.out.println("You are heading towards the broken wooden bridge.\nDo you want to explore further?(y/n)");
					
					door = scan.next();
					
					
						if(door.equalsIgnoreCase("y"))
						{
						System.out.println("\nYou slip on a loose, broken piece of wood and fall into the river.\nA crocodile attacks and eats you.\nGame Over!! Try Again");
						System.exit(0);
						}
						else if(door.equalsIgnoreCase("n"))
						{
						System.out.println("You choose the dark, muddy forest.\nYou slip and brake your leg.");
						System.exit(0);
						}
					}
				}
				if(door.equalsIgnoreCase("3"))
				{
				System.out.println("Do you want to observe your surroundings: (y/n)?");
				door = scan.next();
															
  					if(door.equalsIgnoreCase("y"))
					{
					System.out.println("\nYou are going into the middle of the forest.\nA bear attacks you.\nYou fight it and get injured.\nGame Over!! Try Again");
					System.exit(0);
					}
					else if(door.equalsIgnoreCase("n"))
					{
					System.out.println("\nCongratulations!! You reached accross the forest and found the highway.\nYou reached home safely. ");	 					
					System.exit(0);
					}
  						
				}
	
			}

			if (door.equalsIgnoreCase("n"))
			{
			System.out.println("\nGame Over!! Try Again.");
			System.exit(0);
			}
			else if ( door != y || door != n || door != Y || door != N)
			{
			System.out.println("Invalid entry. Try Again.");
			System.exit(0);
			}
				
		}
	
			
		
	
							
				
// End of If statement for Choice Tree B				
	
	
         
//Choice Tree Option C
	if (door.equalsIgnoreCase("C"))
				{
		System.out.println("You enter the doorway to the East. The passageway is eerily dark.\nGrab a torch before heading in?(y/n)");
			value = scan.nextLine();
			System.out.println("");
				if (value.equalsIgnoreCase("y"))
					{
					System.out.println("You pull a torch off the wall. It's flame is low, but emits enough light to see.");
					System.out.println("");
					System.out.println("You carefully walk through the shadows.\nThe ground is uneven, but your torch helps you to see this.\nSuddenly, you feel something stringy in your face. You...\n \nA. Panic\nB. Brush it off\nC. Step away");
					door = scan.nextLine();
					System.out.println("");
						if(door.equalsIgnoreCase("a"))
						{
						System.out.println("You flail wildly. The torch goes out, and in the darkness you trip and hit your head. You lose consciousness.");
						System.exit(0);
						}
						if(door.equalsIgnoreCase("b"))
						{
						System.out.println("You calmly remove the strange string and examine it.\nIt looks like colorless hair and it has a stickyness to it.\nWithout warning, you can hear something scuttle to your left. Do you...\n\nA.Scream and Run\nB.Turn to confront the noise");
						door = scan.nextLine();
						System.out.println("");
							if(door.equalsIgnoreCase("a"))
							{
							System.out.println("You scream at the top of your lungs and sprint to a nearby passageway.\nThe noise causes the cavern to shake and collapse\nLuckily, you find safety in the newly discovered passageway.\nWhatever was once with you in the previous cavern is long dead now.\n\nYou carefully follow the new passageway to a much larger cavern.\nInside, more of the sticky string clings to the walls and wraps around the cave formations.\nIn a dark corner of the cavern, you can hear the scuttling noise again.\nThe noise moves closer to you.\nOut of the shadows, the creature reveals itself: a child-sized black spider. Do you...\n\nA.BURN IT WITH FIRE!\nB.Scream and run");
							door = scan.nextLine();
							System.out.println("");
								if(door.equalsIgnoreCase("a"))
								{
								System.out.println("You thrust your torch at the arachnid to see its body glow...purple?You notice strange etchings on its back pulse in the violet color.\nThe beast is marked in fire resistant runes.\nThe spider suddenly shreiks and in an instant its eight legged comrads pour into the chamber.\nThey are not fire resistant, and you are able to fend them off until one ebony spider bites you in the leg.\nYour body becomes tense.\nYour vision blurs.\nYou lose consciousness.");
								System.exit(0);
								}
								if(door.equalsIgnoreCase("b"))
								{
								System.out.println("");
								System.out.println("Well if it worked before, might as well do it again right?\nYou let out a loud shriek and run for cover.\nThe room starts to shake as pieces of the ceiling start to fall.\nThe unfortunate spider is crushed under a large boulder.\nIn the aftermath of the minature quake, a shaft of light pierces the darkness.\nThe ceiling has an opening to the surface, and a villager sent to investigate the shaking is waving at you at the top.\nA rope ladder is lowered to you.\nYou climb it to the surface.\nYou escaped!");
								System.exit(0);
								}
							}
						if(door.equalsIgnoreCase("b"))
						{
						System.out.println("You whip around with your torch in front of you.\nIn the inky darkness, a child-sized black spider crawls towards you.\nThe fire from the torch keeps it at bay, but more are coming.\nThey eventually swarm you, and your fire goes out.\nYou lose consciousness");
						System.exit(0);
						}
					
						}
						if(door.equalsIgnoreCase("c"))
						{
						System.out.println("You calmly step backwards from the string, but you make a fatal misstep.\nYou slip and hit your head.\nYou lose consciousness.");
						System.exit(0);
						}
			
				}
				else if (value.equalsIgnoreCase("n"))
				{
				System.out.println("You plunge into the darkness.\nWithin moments, you trip on an uneven surface.\nYou get tangled in a sticky substance.\nStrange sounds close in on you until you feel a sharp pain in your back.\nYou lose consciousness.");
				System.exit(0);
				}
	
			else
			//Alternate entry used 
			{
			System.out.println("Invalid Entry.");
			return;
			}
		
	}
//End of If statement for Choice Tree C
	
//Choice Tree Option D
	if (door.equalsIgnoreCase("D"))
	{
	System.out.println("You enter the doorway to the South. The passageway will take you to a forest.\nBe brave to face anything.\n\nDo you want to move forward?(y/n)");
	value = scan.next();
	System.out.println("");
		if (value.equalsIgnoreCase("y"))
		{
		System.out.println("In which direction you want to move.\n a. Right \n b. Left \n\nEnter your move: ");
		value = scan.next();
			if(value.equalsIgnoreCase("a"))
			{
			 System.out.println("Oops! You slip in the mud and become stuck in a wild animal's pit.\nGame Over!! Try Again");
			 break;
			}
				else if(value.equalsIgnoreCase("b"))
				{
				System.out.println("You are moving forward in the direction where you can hear the sound of a waterfall. \nEnter your move (a/b/c):");
				value = scan.next();
					if(value.equalsIgnoreCase("a"))
					{
					System.out.println("You are heading towards an old wooden bridge.");
					System.out.println("Move your foot(a or b).");
					value = scan.next();
						if(value.equalsIgnoreCase("a"))
						{
						System.out.println("\n\tAah...! \nYou stepped on a loose plank of the bridge and plummeted into the river. \nGame Over!! Try Again");
						break;
						}
							else if(value.equalsIgnoreCase("b"))
							{
							System.out.println("You passed over the old wooden bridge successfully.");
							System.out.println("Now you need to reach a cave by holding onto the tree's branches. \nMove your hands(a/b).");
							value = scan.next();
  								if(value.equalsIgnoreCase("a"))
								{
								System.out.println("\nOoh...!\nYour hands slip, and you fall down in the deep valley. \nGame Over!! Try Again");
					        		break;
					        		}
					   				else if(value.equalsIgnoreCase("b"))
					   				{
					   				System.out.println("\nCongrats!!! You reached the entrance of the cave.");
					   				System.out.println("The cave is dark, but there is enough light to see what's on the ground. \nMove forward(a/b):");
				           				value = scan.next();
                                           					if(value.equalsIgnoreCase("a"))
					   					{
										System.out.println("\nAah...!\nSnakes came in through a fracture in the ground and bit you!! \nGame Over!! Try Again.");
										break;
					   					}
					   						else if(value.equalsIgnoreCase("b"))
					    						{
											System.out.println("\nYou find a lanturn just before the entrance of cave.\nStart moving.(a/b) ");
                                                					value = scan.next();
												if(value.equalsIgnoreCase("a"))
												{
						 						System.out.println("\nA tiger is sleeping. Move forward.");
						 						System.out.println("");
						 						System.out.println("Barve and Bold are paid for their guts. \n Congrats!!!!! You found the Treasure Box! \nHappy Treasure Hunting!!! \n!!!Game Over!!!") ;
							 					break;
												}
													else if(value.equalsIgnoreCase("b"))
													{
						 							System.out.println("\nYou are caught by the tiger. \n The tiger kills you.! \nGame Over!! Try Again.");
						 							break;
													}
					    							}

				         						}

					 				 }
					  
							} 
						else if(value.equalsIgnoreCase("b"))
						{
						 System.out.println("You reached the cave. There is some delicious food at entrance of the cave. You eat it and fall asleep.");
						 System.out.println("Wake up and move forward.(a/b)");
					 	 value = scan.next();
                                         		if(value.equalsIgnoreCase("a"))
					 		{
					  		System.out.println("You are in the way where wild elephants live. You are struck by a stampede!!! \nGame Over!! Try Again."); 
					  		break;
							}
					 			else if(value.equalsIgnoreCase("b"))
								{
					  			System.out.println("Barve and Bold are paid for their guts. \n Congrats!!!!! You Found the Treasure Box. \nHappy Treasure Hunting!!! \n!!!Game Over!!!") ;
					 			break;	
					 			}
							}
							else if(value.equalsIgnoreCase("c"))
							{
					 		System.out.println("Howling dogs are on their way. Be ready to run from there.");
					 		System.out.println("After you run from there, you will reach the peak of a hill.\n In there you will find a snake pit where the treasure is.\nYour move(a/b).");
					 		value = scan.next();
					 			if(value.equalsIgnoreCase("a"))
								{
					 			System.out.println("Snakes are not there in The pit.");
					 			System.out.println("Barve and Bold are paid for their guts. \n Congrats!!!!! You Found the Treasure Box. \nHappy Treasure Hunting!!! \n!!!Game Over!!!") ;
					  			break;
					 			}
									else if(value.equalsIgnoreCase("b"))
									{
					  				System.out.println("A python is there in the pit. You caught by the python. \nGame Over!!! Try Again.");
                                          				break;
					 				}
								}
							}
						}
		else if (value.equalsIgnoreCase("n"))
		{
		System.out.println("Better luck for next time.");
		break;
		}
// End of If statement for Choice Tree D				
	}


	 

		
		
// Error loop.
	if ((door != c) || (door != C) || (door != b) || (door != B) || (door != a) || (door != A))
		{

		System.out.println("Invalid answer. Attempt again.");
		return;
		}
	//End of While statement
	}

//End of Main
}

//End of class TD
}