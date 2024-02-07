import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Zoo {
static ArrayList<Turtle> list_turtle  = new ArrayList<>(); 
static ArrayList<Penguin> list_penguin  = new ArrayList<>(); 
static ArrayList<Tiger> list_tiger = new ArrayList<>(); 
static ArrayList<Dragon> list_dragon  = new ArrayList<>();  
public static void main(String[] args) {
	Dragon dragon = new Dragon(0,5000,0,0,0);
	Turtle turtle = new Turtle(0,500,0,0,0);
	Penguin penguin = new Penguin(0,1000,0,0,0);
	Tiger tiger = new Tiger(0,3000,0,0,0);
	
	
	
	String[] response = {"Buy Animals:","Buy Food: ",  "Advance Day", "Quit Game"};
	long money = 10000;
	String play = JOptionPane.showInputDialog("If you would like to play type yes if you don't want to play type no");
	if(play.equals("yes")) {
		String play1 = "";
	 int choice =0;
	 int day = 0;
	 int animal = 0;
	 int Food = 0;
	 int food_turtle =3;
	 int food_penguin =3;
	 int food_tiger = 3;
	 int food_dragon = 3;
		while(!(choice == 3) ) {
			
		 choice = JOptionPane.showOptionDialog(null, "You are the owner of the zoo you can decide what animals you get for your zoo \n you start with Money:"
		 + " " + money + " \n You have "  + list_turtle.size() + " Turtles " 
		 + " \n You have "  + list_penguin.size() + " Penguins " 
		 + " \n You have "  + list_tiger.size() + " Tigers "
		 + " \n You have "  + list_dragon.size() + " Dragons " + " \n You are currently day: " + day ,   null, 0 ,0, null, response, null);
		if(choice == 0) {
			while(true) {
			String[] buyAnimals = {"One trutle $500:","Ten trutle $5000:", "One Penguin $1000:","Ten Penguin $10000:","One Tiger $3000:","Ten Tiger $30000:","One Dragon $5000:","Ten Dragons $100000:","Back" };
		animal = JOptionPane.showOptionDialog(null, "Here are your aniaml choices\n You have $" + money  , null,  0 ,0, null, buyAnimals, null);
		 	
				if(animal == 0 && money >= 500) {
				 list_turtle.add(new Turtle(0,500,0,0,0));
				 money -= turtle.getCost();
				 
			 }
			 else if(animal == 1 && money >= 5000) {
				int count = 0;
				 while(count<10) {
				 list_turtle.add(new Turtle(0,500,0,0,0));
				 money -= turtle.getCost();
				 count++;
				 }
				 
			 }
			 else if(animal == 2 && money >= 1000) {
				 list_penguin.add(new Penguin(0,1000,0,0,0));
				 money -= penguin.getCost();
				 
			 }
			 else if(animal == 3 && money >= 10000) {
					int count = 0;
					 while(count<10) {
					 list_penguin.add(new Penguin(0,1000,0,0,0));
					 money -= penguin.getCost();
					 count++;
					 }
					 
				 }
			 else if(animal == 4 && money >= 3000) {
				 list_tiger.add(new Tiger(0,3000,0,0,0));
				 money -= tiger.getCost();
				 
			 }
			 else if(animal == 5 && money >= 30000) {
					int count = 0;
					 while(count<10) {
					 list_tiger.add(new Tiger(0,3000,0,0,0));
					 money -= tiger.getCost();
					 count++;
					 }
					 
				 }
			 
			 else if(animal == 6 && money >= 5000) {
				 list_dragon.add(new Dragon(0,5000,0,0,0));
				 money -= dragon.getCost();
				 
			 }
			 else if(animal == 7 && money >= 50000) {
					int count = 0;
					 while(count<10) {
					 list_dragon.add(new Dragon(0,5000,0,0,0));
					 money -= dragon.getCost();
					 count++;
					 }
					 
				 }
			 else if(animal == 8) {
				 break;
			 }
		}
		}
		if(choice == 1) {
			while(true) {
			String[] buyFood = {"Turtle Food: $100","Penguin Food: $200","Tiger Food: $500","Dragon Food: $1500","Back"};
			Food = JOptionPane.showOptionDialog(null, "Here are your food choices\n You have $" + money , null,  0 ,0, null, buyFood, null);
			 if (Food== 0) {
				 food_turtle = 3;
				 money -= 100;
			 }
			 else if (Food == 1) {
				 food_penguin = 3;
				 money -= 200;
			 }
			 else if (Food == 2) {
				 food_tiger = 3;
				 money -= 500;
			 }
			 else if (Food == 3) {
				 food_dragon = 3;
				 money -= 1500;
			 }
			 else if(Food == 4) {
				 break;
			 }
		}
		} 
			
			 else if (choice == 2) {
				 day ++; 
				 if(list_turtle.size() >= 1) {
					 food_turtle --;
				 }
				 if(list_penguin.size() >= 1) {
					 food_penguin --;
				 }
				 if(list_tiger.size() >= 1) {
					 food_tiger --;
				 }
				 if(list_dragon.size() >= 1) {
					 food_dragon --;
				 }
				
				 for(int i = 0; i< list_turtle.size(); i++ ) {
					list_turtle.get(i).setAge(list_turtle.get(i).getAge()+1);	 
				 }
				 for(int i = 0; i< list_penguin.size(); i++ ) {
					 list_penguin.get(i).setAge(list_penguin.get(i).getAge()+1);
				 }
				 for(int i = 0; i< list_tiger.size(); i++ ) {
					 list_tiger.get(i).setAge(list_tiger.get(i).getAge()+1);	 
				 }
				 for(int i = 0; i< list_dragon.size(); i++ ) {
					 list_dragon.get(i).setAge(list_dragon.get(i).getAge()+1); 
				 }
				 
				int size1 = turtle.getCost()/3 *list_turtle.size();
				money += size1;
				
				int size2 =  penguin.getCost()/4 * list_penguin.size();
				money += size2;
					
				int size3 = tiger.getCost()/5 * list_tiger.size();
				money += size3;
				
				int size4 = dragon.getCost()/6 * list_dragon.size();
				money += size4;
				
				
				
				if(food_turtle <= 0 && list_turtle.size()>=1) {
					 
					for(int i =0; i<list_turtle.size();i++) {
						
					if(list_turtle.get(i).getAge()>=3) {
						
					list_turtle.remove(list_turtle.get(i));
					i--;
					
					}
					}
				food_turtle = 3;
				JOptionPane.showMessageDialog(null, "You didnt feed your Tutrles some of them has died");
			 }
				if(food_penguin <= 0 && list_penguin.size()>=1) {
					for(int i =0; i<list_penguin.size();i++) {
						
					if(list_penguin.get(i).getAge()>=3) {
						
					list_penguin.remove(list_penguin.get(i));
					i--;
					}
					}
				food_penguin = 3;
				JOptionPane.showMessageDialog(null, "You didnt feed your Penguin some of them has died");
			 }
				if(food_tiger <= 0 && list_tiger.size()>=1) {
					for(int i =0; i<list_tiger.size();i++) {
						
					if(list_tiger.get(i).getAge()>=3) {
						
					list_tiger.remove(list_tiger.get(i));
					i--;
					}
					}
				food_tiger = 3;
				JOptionPane.showMessageDialog(null, "You didnt feed your Tigers some of them has died");
			 }
				if(food_dragon <= 0 && list_dragon.size()>=1) {
					for(int i =0; i<list_dragon.size();i++) {
						
					if(list_dragon.get(i).getAge()>=3) {
						
					list_dragon.remove(list_dragon.get(i));
					i--;
					}
					}
				food_dragon = 3;
				JOptionPane.showMessageDialog(null, "You didnt feed your Dragons some of them has died");
			 }
		

				int rand = (int)(Math.random()*(10-1))+1;
				ArrayList<String> birth_turtle = new ArrayList<>();
				ArrayList<String> birth_penguin = new ArrayList<>();
				ArrayList<String> birth_tiger = new ArrayList<>();
				ArrayList<String> birth_dragon = new ArrayList<>();
				if(rand == 1) {
				for(int i =0; i<list_turtle.size();i++) {
				if( list_turtle.get(i).getAge()>=3 ) {
					birth_turtle.add("Turtle");
				}
				
				
				
			}
				int numBabies = birth_turtle.size()/2;
				if(numBabies!= 0) {
				JOptionPane.showMessageDialog(null, "Your turtles have mated you gained " + numBabies + " Turtles");
				while(numBabies >0) {
					list_turtle.add(new Turtle(0,500,0,0,0));
					
					numBabies --;
					
				}
				}
			
				}
				if(rand == 2) {
					for(int i =0; i<list_penguin.size();i++) {
					if( list_penguin.get(i).getAge()>=3 ) {
						birth_penguin.add("Penguin");
					}
					
					
					
				}
					int numBabies1 = birth_penguin.size()/2;
					if(numBabies1!= 0) {
					JOptionPane.showMessageDialog(null, "Your Penguins have mated you gained " + numBabies1 + " Penguin");
					while(numBabies1 >0) {
						list_penguin.add(new Penguin(0,500,0,0,0));
						
						numBabies1 --;
						
					}
					}
				
					}
				if(rand == 3) {
					for(int i =0; i<list_tiger.size();i++) {
					if( list_tiger.get(i).getAge()>=3 ) {
						birth_tiger.add("tiger");
					}
					
					
					
				}
					int numBabies3 = birth_tiger.size()/2;
					if(numBabies3!= 0) {
					JOptionPane.showMessageDialog(null, "Your Tigers have mated you gained " + numBabies3 + " 	Tigers");
					while(numBabies3 >0) {
						list_tiger.add(new Tiger(0,500,0,0,0));
						
						numBabies3 --;
						
					}
					}
					
					}
				if(rand == 4) {
					for(int i =0; i<list_dragon.size();i++) {
					if( list_dragon.get(i).getAge()>=3 ) {
						birth_dragon.add("dragon");
					}
					
					
					
				}
					int numBabies4 = birth_dragon.size()/2;
					if(numBabies4!= 0) {
					JOptionPane.showMessageDialog(null, "Your Dragons have mated you gained " + numBabies4 + " 	Dragons");
					while(numBabies4 >0) {
						list_dragon.add(new Dragon(0,500,0,0,0));
						
						numBabies4 --;
						
					}
					}
					
					}
				if(rand == 5) {
					int randSickness = (int)(Math.random()*(4-1))+1;
					if(randSickness == 1 && list_turtle.size() >= 1) {
						JOptionPane.showMessageDialog(null, "One of your turtles died from a sickness");
						list_turtle.remove(0);
					}
					
					if(randSickness == 2 && list_penguin.size() >= 1) {
						JOptionPane.showMessageDialog(null, "One of your penguins died from a sickness");
						list_penguin.remove(0);
					}
					
					if(randSickness == 3 && list_tiger.size() >= 1) {
						JOptionPane.showMessageDialog(null, "One of your tigers died from a sickness");
						list_tiger.remove(0);
					}
					
					if(randSickness == 4 && list_dragon.size() >= 1) {
						JOptionPane.showMessageDialog(null, "One of your dragons died from a sickness");
						list_dragon.remove(0);
					}
					
						
				}
				if(rand == 6) {
					int randBonus = (int)(Math.random()*(4-1))+1;
					if(randBonus == 1 && list_turtle.size() >= 1) {
						money += list_turtle.size() * 250;
						JOptionPane.showMessageDialog(null, "You have gotten a bouns $250 per turtle you have");
						
					}
					
					if(randBonus == 2 && list_penguin.size() >= 1) {
						money += list_penguin.size() * 500;
						JOptionPane.showMessageDialog(null, "You have gotten a bouns $500 per penguin you have");
						
					}
					
					if(randBonus == 3 && list_tiger.size() >= 1) {
						money += list_tiger.size() * 1500;
						JOptionPane.showMessageDialog(null, "You have gotten a bouns $1500 per tiger you have");
						
					}
					
					if(randBonus == 4 && list_dragon.size() >= 1) {
						money += list_dragon.size() * 2500;
						JOptionPane.showMessageDialog(null, "You have gotten a bouns $2500 per dragon you have");
						
					}
					
				}
				if(rand == 7 || rand == 8 || rand == 9 || rand == 10) {
					JOptionPane.showMessageDialog(null, "Nothing has happened today");
				}
			}			
	
		 	if(money == 0) {
		 	JOptionPane.showMessageDialog(null, "You ran out of money you loose");	   
		 	break;
}
		}	
}
}
}
	 



