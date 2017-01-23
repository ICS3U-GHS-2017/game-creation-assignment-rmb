class TextRimMASTERRRRRRRRRR
{
  public static void HumanSword (int health)
  {
    int enemy = 5;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        System.out.println("You attack with your sword!");
        chance = (Math.random()*(10-1))+1;
        chance = Math.round(chance);
        if (chance <= 7)
        {
          System.out.println("You dealt 3 damage to the enemy!");
          enemy = enemy-3;
          System.out.println("The enemy's health is "+enemy+".");
        }
        if (chance > 7)
        {
          System.out.println("You missed!");
        }
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(3-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The enemy does a horizontal swing with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You countered the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The enemy predicted a counter!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The enemy does a forward lunge with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 3)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You countered the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The enemy predicted a counter!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The enemy does a vertical swing with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("You countered the attack!");
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void HumanDagger (int health)
  {
    int enemy = 5;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        System.out.println("You attack with your dagger!");
        chance = (Math.random()*(10-1))+1;
        chance = Math.round(chance);
        if (chance <= 8)
        {
          System.out.println("You dealt 2 damage to the enemy!");
          enemy = enemy-2;
          System.out.println("The enemy's health is "+enemy+".");
        }
        if (chance > 8)
        {
          System.out.println("You missed!");
        }
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(3-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The enemy does a horizontal swing with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You deflected the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy predicted a deflect!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The enemy does a forward lunge with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You deflected the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy predicted a deflect!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The enemy does a vertical swing with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("You deflected the attack!");
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void HumanAxe (int health)
  {
    int enemy = 5;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        System.out.println("You attack with your axe!");
        chance = (Math.random()*(10-1))+1;
        chance = Math.round(chance);
        if (chance <= 6)
        {
          System.out.println("You dealt 4 damage to the enemy!");
          enemy = enemy-4;
          System.out.println("The enemy's health is "+enemy+".");
        }
        if (chance > 6)
        {
          System.out.println("You missed!");
        }
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(3-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The enemy does a horizontal swing with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You blocked the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy breaks through your block!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The enemy does a forward lunge with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You blocked the attack!");
          }
          if (chance > 8)
          {
            System.out.println("The enemy breaks through your block!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The enemy does a vertical swing with their sword! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("You blocked the attack!");
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void AnimalSword (int health, int ammo)
  {
    int enemy = 8;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    int weaponAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        if (ammo > 0)
        {
          System.out.println("Will you attack with your sword or ranged weapon?");
          System.out.println("Sword = 1  Ranged Weapon = 2");
          weaponAttack = In.getInt();
        }
        if (ammo < 1)
        {
          weaponAttack = 1;
        }
        if (weaponAttack == 1)
        {
          System.out.println("You attack with your sword!");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dealt 3 damage to the enemy!");
            enemy = enemy-3;
            System.out.println("The enemy's health is "+enemy+".");
          }
          if (chance > 6)
          {
            System.out.println("You missed!");
          }
        }
        if (weaponAttack == 2)
        {
          System.out.println("You attack with your ranged weapon.");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dealt 3 damage to the enemy!");
            enemy = enemy-3;
            System.out.println("The enemy's health is "+enemy+".");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
          if (chance > 8)
          {
            System.out.println("You missed!");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
        } 
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(3-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The enemy goes for a bite! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("You countered the attack!");
          }
          if (chance > 5)
          {
            System.out.println("The enemy predicted a counter!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The enemy pounces at you! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 3)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("You countered the attack!");
          }
          if (chance > 5)
          {
            System.out.println("The enemy predicted a counter!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The enemy attacks with it's claws! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("You countered the attack!");
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void AnimalDagger (int health, int ammo)
  {
    int enemy = 8;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    int weaponAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        if (ammo > 0)
        {
          System.out.println("Will you attack with your dagger or ranged weapon?");
          System.out.println("Dagger = 1  Ranged Weapon = 2");
          weaponAttack = In.getInt();
        }
        if (ammo < 1)
        {
          weaponAttack = 1;
        }
        if (weaponAttack == 1)
        {
          System.out.println("You attack with your dagger!");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dealt 2 damage to the enemy!");
            enemy = enemy-2;
            System.out.println("The enemy's health is "+enemy+".");
          }
          if (chance > 7)
          {
            System.out.println("You missed!");
          }
        }
        if (weaponAttack == 2)
        {
          System.out.println("You attack with your ranged weapon.");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dealt 3 damage to the enemy!");
            enemy = enemy-3;
            System.out.println("The enemy's health is "+enemy+".");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
          if (chance > 8)
          {
            System.out.println("You missed!");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
        } 
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(3-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The enemy goes for a bite! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You deflected the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The enemy predicted a deflect!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The enemy pounces at you! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You deflected the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The enemy predicted a deflect!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The enemy attacks with it's claws! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("You deflected the attack!");
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void AnimalAxe (int health, int ammo)
  {
    int enemy = 8;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    int weaponAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        if (ammo > 0)
        {
          System.out.println("Will you attack with your axe or ranged weapon?");
          System.out.println("Axe = 1  Ranged Weapon = 2");
          weaponAttack = In.getInt();
        }
        if (ammo < 1)
        {
          weaponAttack = 1;
        }
        if (weaponAttack == 1)
        {
          System.out.println("You attack with your axe!");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("You dealt 4 damage to the enemy!");
            enemy = enemy-4;
            System.out.println("The enemy's health is "+enemy+".");
          }
          if (chance > 5)
          {
            System.out.println("You missed!");
          }
        }
        if (weaponAttack == 2)
        {
          System.out.println("You attack with your ranged weapon.");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 8)
          {
            System.out.println("You dealt 3 damage to the enemy!");
            enemy = enemy-3;
            System.out.println("The enemy's health is "+enemy+".");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
          if (chance > 8)
          {
            System.out.println("You missed!");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
        } 
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(3-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The enemy goes for a bite! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You blocked the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy breaks through your block!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The enemy pounces at you! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy hits you anyway!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You blocked the attack!");
          }
          if (chance > 7)
          {
            System.out.println("The enemy breaks through your block!");
            System.out.println("You took 2 damage!");
            health = health-2;
          }
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The enemy attacks with it's claws! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The enemy easily hits you!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 2 damage!");
          health = health-2;
        }
        if (dodge == 5)
        {
          System.out.println("You blocked the attack!");
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
   public static void DragonSword (int health, int ammo)
  {
    int enemy = 15;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    int weaponAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        if (ammo > 0)
        {
          System.out.println("Will you attack with your sword or ranged weapon?");
          System.out.println("Sword = 1  Ranged Weapon = 2");
          weaponAttack = In.getInt();
        }
        if (ammo < 1)
        {
          weaponAttack = 1;
        }
        if (weaponAttack == 1)
        {
          System.out.println("You attack with your sword!");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("You dealt 2 damage to the dragon!");
            enemy = enemy-2;
            System.out.println("The dragon's health is "+enemy+".");
          }
          if (chance > 5)
          {
            System.out.println("You missed!");
          }
        }
        if (weaponAttack == 2)
        {
          System.out.println("You attack with your ranged weapon.");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dealt 2 damage to the dragon!");
            enemy = enemy-2;
            System.out.println("The dragon's health is "+enemy+".");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
          if (chance > 7)
          {
            System.out.println("You missed!");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
        } 
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(5-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The dragon goes for a bite! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 4)
          {
            System.out.println("You countered the attack!");
          }
          if (chance > 4)
          {
            System.out.println("The dragon predicted a counter!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The dragon breathes fire at you! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 3)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 4)
          {
            System.out.println("You countered the attack!");
          }
          if (chance > 4)
          {
            System.out.println("The dragon predicted a counter!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The dragon attacks with it's claws! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("You countered the attack!");
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 4)
      {
        System.out.println("The dragon creates a gust with it's wings! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 4)
          {
            System.out.println("You countered the attack!");
          }
          if (chance > 4)
          {
            System.out.println("The dragon predicted a counter!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 5)
      {
        System.out.println("The dragon attacks with it's tail! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("You countered the attack!");
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void DragonDagger (int health, int ammo)
  {
    int enemy = 15;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    int weaponAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        if (ammo > 0)
        {
          System.out.println("Will you attack with your dagger or ranged weapon?");
          System.out.println("Dagger = 1  Ranged Weapon = 2");
          weaponAttack = In.getInt();
        }
        if (ammo < 1)
        {
          weaponAttack = 1;
        }
        if (weaponAttack == 1)
        {
          System.out.println("You attack with your dagger!");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dealt 1 damage to the dragon!");
            enemy = enemy-1;
            System.out.println("The dragon's health is "+enemy+".");
          }
          if (chance > 6)
          {
            System.out.println("You missed!");
          }
        }
        if (weaponAttack == 2)
        {
          System.out.println("You attack with your ranged weapon.");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dealt 2 damage to the dragon!");
            enemy = enemy-2;
            System.out.println("The dragon's health is "+enemy+".");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
          if (chance > 7)
          {
            System.out.println("You missed!");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
        } 
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(5-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The dragon goes for a bite! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("You deflected the attack!");
          }
          if (chance > 5)
          {
            System.out.println("The dragon predicted a deflect!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The dragon breathes fire at you! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("You deflected the attack!");
          }
          if (chance > 5)
          {
            System.out.println("The dragon predicted a deflect!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The dragon attacks with it's claws! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          System.out.println("You deflected the attack!");
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 4)
      {
        System.out.println("The dragon creates a gust with it's wings! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("You deflected the attack!");
          }
          if (chance > 5)
          {
            System.out.println("The dragon predicted a deflect!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
      if (enemyAttack == 5)
      {
        System.out.println("The dragon attacks with it's tail! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          System.out.println("You deflected the attack!");
        }
        if (dodge == 5)
        {
          System.out.println("Only an axe can block!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void DragonAxe (int health, int ammo)
  {
    int enemy = 15;
    double chance = 0;
    double enemyAttack = 0;
    int dodge = 0;
    int yourAttack = 0;
    int weaponAttack = 0;
    while (health > 0)
    {
      System.out.println("Your health is "+health+".");
      System.out.println("Will you attack?");
      System.out.println("Yes = 1  No = 2");
      yourAttack = In.getInt();
      if (yourAttack == 1)
      {
        if (ammo > 0)
        {
          System.out.println("Will you attack with your axe or ranged weapon?");
          System.out.println("Axe = 1  Ranged Weapon = 2");
          weaponAttack = In.getInt();
        }
        if (ammo < 1)
        {
          weaponAttack = 1;
        }
        if (weaponAttack == 1)
        {
          System.out.println("You attack with your axe!");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 4)
          {
            System.out.println("You dealt 3 damage to the dragon!");
            enemy = enemy-3;
            System.out.println("The dragon's health is "+enemy+".");
          }
          if (chance > 4)
          {
            System.out.println("You missed!");
          }
        }
        if (weaponAttack == 2)
        {
          System.out.println("You attack with your ranged weapon.");
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 7)
          {
            System.out.println("You dealt 2 damage to the dragon!");
            enemy = enemy-2;
            System.out.println("The dragon's health is "+enemy+".");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
          if (chance > 7)
          {
            System.out.println("You missed!");
            ammo = ammo-1;
            System.out.println("You have "+ammo+" ammo left.");
          }
        } 
        if (enemy <= 0)
        {
          System.out.println("You won!");
          return;
        }
      }
      if (yourAttack == 2)
      {
        System.out.println("You don't attack!");
      }
      enemyAttack = (Math.random()*(5-1))+1;
      enemyAttack = Math.round(enemyAttack);
      if (enemyAttack == 1)
      {
        System.out.println("The dragon goes for a bite! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You blocked the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon breaks through your block!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
      }
      if (enemyAttack == 2)
      {
        System.out.println("The dragon breathes fire at you! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You blocked the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon breaks through your block!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
      }
      if (enemyAttack == 3)
      {
        System.out.println("The dragon attacks with it's claws! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          System.out.println("You blocked the attack!");
        }
      }
      if (enemyAttack == 4)
      {
        System.out.println("The dragon creates a gust with it's wings! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You dodged the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon hits you anyway!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 6)
          {
            System.out.println("You blocked the attack!");
          }
          if (chance > 6)
          {
            System.out.println("The dragon breaks through your block!");
            System.out.println("You took 3 damage!");
            health = health-3;
          }
        }
      }
      if (enemyAttack == 5)
      {
        System.out.println("The dragon attacks with it's tail! What will you do?");
        System.out.println("Duck Down = 1  Deflect = 4");
        System.out.println("Side-Step = 2  Block   = 5");
        System.out.println("Counter   = 3");
        dodge = In.getInt();
        if (dodge == 1)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 2)
        {
          System.out.println("Bad move! The dragon easily hits you!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 3)
        {
          System.out.println("Only a sword can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 4)
        {
          System.out.println("Only a dagger can deflect!");
          System.out.println("You took 3 damage!");
          health = health-3;
        }
        if (dodge == 5)
        {
          System.out.println("You blocked the attack!");
        }
      }
    }
    System.out.println("You died!");
    System.exit(0);
  }
  public static void main (String args[])
  {
    double chance = 0;
    int weapon = 0;
    int GuardFight = 0;
    int health = 5;
    int ammo=5;
    System.out.println("You awake on a wagon heading down a path in the middle of a forest.");
    System.out.println("Will you wait on the wagon?(Enter 1 for Yes or Enter 2 for No)");
    int Ques1=ln.getInt();
    if(Ques1==1)
    {
      System.out.println("You decide to wait.");
      System.out.println("You continue to wait in the wagon until you reach a small village.");
      System.out.print("The guards force you out of the wagon and take you to the executioner.");
      int x = 3;
      int y = 0;
      int Ques2=0;
    while(x>y && Ques2!=2)
    {
    System.out.println("You are about to be executed. Will you wait to be last?(Enter 1 for Yes or Enter 2 for No)");
     Ques2=ln.getInt();
    if(Ques2==1)
    {
      System.out.println("You decide to wait.");
      System.out.println("You watch as another prisoner is forced to his knees, and gets beheaded.");
    }
    if(Ques2==2)
    {
      System.out.println("You decide to get it over with.");
      System.out.println("The executioner beheads you.");
    }
    y++;
    if(x==y)
    {
      System.out.println("However you are called up to be executed.");
      System.out.println("You get forced to your knees, the executioner raises his axe over his head.");
      System.out.println("As the executioner is about to behead you a dragon lands behind him.");
      System.out.println("Everyone turns around in shock so you get up and run to a nearby watchtower.");
      System.out.println("Inside the watchtower you meet another prisoner who managed to escape.");
      System.out.println("He says his name is Brandr.");
      System.out.println("What is your name?");
      String name=ln.getString();
      System.out.println("You and Brandr find a chest in the watchtower that contains 3 weapons.");
      System.out.println("The chest contains a sword, dagger and battle-axe. You can only carry one.");
      System.out.println("Enter 1 for sword 2 for dagger and 3 for battle-axe");
      weapon=ln.getInt();
      if(weapon==1)
      {
        System.out.println("You decide to take the sword.");
      }
      if(weapon==2)
      {
        System.out.println("You decide to take the dagger.");
      }
      if(weapon==3)
      {
        System.out.println("You decide to take the battle-axe.");
      }
      System.out.println("You and Brandr try to escape the village by sneaking out the back of the watchtower.");
      System.out.println("As you round a corner of a house two guards spot you and confront you.");
      System.out.println("The guards are walking towards you.");
      System.out.println("Will you fight them? Enter 1 to fight enter 2 to talk");
      int Ques5=ln.getInt();
      if(Ques5==1)
      {
        GuardFight = 1;
        System.out.println("You decide to fight them");
        System.out.println(name+" and Brandr vs Guards Begin");
        if (weapon == 1)
        {
          HumanSword(health);
        }
        if (weapon == 2)
        {
          HumanDagger(health);
        }
        if (weapon == 3)
        {
          HumanAxe(health);
        }
      }
      if(Ques5==2)
      {
        GuardFight = 2;
        System.out.println("You decide to talk to them");
        System.out.println("The guards ask what you are?");
        System.out.println("You decide you can tell them that your either a prisoner, guard, civilian or you could stay silent");
        System.out.println("Enter 1 for prisoner 2 for guard 3 for civilian or 4 to stay silent");
        int Ques6=ln.getInt();
        if(Ques6==1)
        {
          System.out.println("You tell them you are a prisoner");
          System.out.println("The guards attack you");
          System.out.println(name+" and Brandr vs Guards Begin");
          if (weapon == 1)
        {
          HumanSword(health);
        }
        if (weapon == 2)
        {
          HumanDagger(health);
        }
        if (weapon == 3)
        {
          HumanAxe(health);
        }
        }
        if(Ques6==2)
        {
          System.out.println("You tell them you are a guard");
          System.out.println("You tell them you're guards, and you were asleep when the dragon came so you're not in your uniform.");
          if(weapon==1 || weapon==3)
          {
            System.out.print("The guards believe you and tell you to continue on.");
          }
          if(weapon==2)
          {
            System.out.print("The guard doesn't believe you since he knows a guard wouldn't leave his house without his sword or axe.");
            System.out.println("The guards attack you.");
            System.out.println(name+" and Brandr vs Guards Begin");
            if (weapon == 1)
            {
              HumanSword(health);
            }
            if (weapon == 2)
            {
              HumanDagger(health);
            }
            if (weapon == 3)
            {
              HumanAxe(health);
            }
          }
        }
        if(Ques6==3)
        {
          System.out.println("You tell them you are a civilian");
          if(weapon==2)
          {
            System.out.print("The guards believe you and wish you luck.");
          }
          if(weapon==1 || weapon==3)
          {
            System.out.print("The guards don't believe you as they see your weapon.");
            System.out.println("The guards attack you.");
            System.out.println(name+" and Brandr vs Guards Begin");
            if (weapon == 1)
            {
              HumanSword(health);
            }
            if (weapon == 2)
            {
              HumanDagger(health);
            }
            if (weapon == 3)
            {
              HumanAxe(health);
            }
          }
        }
        if(Ques6==4)
        {
          System.out.println("You decide to not say anything");
          System.out.println("The guards attack you.");
          if (weapon == 1)
          {
            HumanSword(health);
          }
          if (weapon == 2)
          {
            HumanDagger(health);
          }
          if (weapon == 3)
          {
            HumanAxe(health);
          }
        }
      }
      System.out.println(" You and Brandr escape the village and run down the main road.");
      System.out.print("You spot a cave to left hidden in the side of a mountain.");
      System.out.println(" You see two diffrent paths ahead of you.");
      System.out.println("The first path is a road the second a cave.");
      System.out.println("Enter 1 to follow the road or enter 2 to enter the cave ");
      int Ques7=ln.getInt();
      if(Ques7==1)
      {
        System.out.println("You decide to follow the road");
        System.out.println("You and Brandr continue along the road when you spot three bandits looting a body.");
        System.out.println("The bandits see you before you and Brandr are able to hide and come running towards you.");
        if (weapon == 1)
        {
          HumanSword(health);
        }
        if (weapon == 2)
        {
          HumanDagger(health);
        }
        if (weapon == 3)
        {
          HumanAxe(health);
        }
        System.out.println("After you and Brandr kill two of the bandits the third one runs away.");
        System.out.println("You see a bag on one of the bandits back.");
         int LoopQues8=0;
         while(LoopQues8!=1)
         {
           System.out.println("Will you open the bag or leave it?");
           System.out.println("Enter 1 to open bag or 2 to leave it");
           int Ques8=ln.getInt();
           if(Ques8==1)
           {
             System.out.println("You decide to open the bag");
             System.out.println("You find a bow and arrow in the bag.");
             LoopQues8++;
           }
           if(Ques8==2)
           {
             System.out.println("You decide to not open the bag and instead check the pouches of the fallen bandits");
             System.out.println("You check the bandits pouches and find a note with a message scribbled on it.");
             System.out.println("Only the one with the name Dovahkiin can tame the dragon");
           }
         }
            System.out.print("You and Brandr decide not to walk on the road but in the forested area next to it.");
            System.out.println(" As you and Brandr are walking through the forest you see a tiger feasting on a dead antelope.");
            System.out.println("You decide to either sneak around or attack it.");
            System.out.println("Enter 1 to sneak around or 2 to attack it");
            int Ques10=ln.getInt();
            if(Ques10==1)
            {
              System.out.println("You decide to sneak around");
              System.out.println("You and Brandr crouch down and start moving past the tiger");
              System.out.println("You decide you can either sneak around slowly or quickly");
              System.out.println("Enter 1 to sneak around slowly or enter 2 to sneak around quickly");
              int Ques12=ln.getInt();
              if(Ques12==1)
              {
                System.out.println("You decide to sneak around slowly");
                System.out.println("You and Brandr move slowly past and you step on a stick that cracks.");
                System.out.print("The tiger looks over his shoulder, pauses, then continues eating.");
                System.out.print("You and Brandr keep moving and eventually get back on the main road.");
              }
              if(Ques12==2)
              {
                System.out.println("You decide to sneak around quickly");
                System.out.println("You and Brandr move quickly past and you step on a stick that cracks.");
                System.out.print("The tiger looks over his shoulder and sees you and comes running towards you.");
                if (weapon == 1)
                {
                  AnimalSword(health, ammo);
                }
                if (weapon == 2)
                {
                  AnimalDagger(health, ammo);
                }
                if (weapon == 3)
                {
                  AnimalAxe(health, ammo);
                }
              }
            }
            if(Ques10==2)
            {
              System.out.println("You decide to attack it");
              System.out.println("You sneak up behind the tiger but it wakes up and attacks you.");
              if (weapon == 1)
              {
                AnimalSword(health, ammo);
              }
              if (weapon == 2)
              {
                AnimalDagger(health, ammo);
              }
              if (weapon == 3)
              {
                AnimalAxe(health, ammo);
              }
            }
          }
        if(Ques7==2)
        {
          System.out.println("You decide to enter the cave");
          System.out.println("You and Brandr head into the cave, it's much darker than you thought and you have to light a torch.");
          System.out.print("As you're walking through the cave you see a dark figure ahead, you get closer and realize it's a skeleton.");
          System.out.print("You try to turn around but there's another one behind you, you have no choice but to fight.");
          if (weapon == 1)
          {
            HumanSword(health);
          }
          if (weapon == 2)
          {
            HumanDagger(health);
          }
          if (weapon == 3)
          {
            HumanAxe(health);
          }
          System.out.println("You see a chest with weird engravings on it near the wall.");
          int LoopQues9=0;
          while(LoopQues9!=1)
          {
            System.out.println("Will you open the chest or leave it?");
            System.out.println("Enter 1 to open chest or 2 to leave it");
            int Ques9=ln.getInt();
            if(Ques9==1)
            {
              System.out.println("You decide to open the chest");
              System.out.println("You find a magic scroll in the chest.");
              System.out.print("You hear a noise behind you and see about twenty skeletons heading your way.");
              System.out.print("You and Brandr sprint the other way and manage to close a door blocking them off.");
              System.out.println("You don't know how long the door will hold so you quickly continue through the cave.");
              System.out.println("You get to an open area in the cave with sunlight shining through a hole in the ceiling.");
              System.out.print("You see a bear sleeping next to a rock in the corner.");
              LoopQues9++;
            }
            if(Ques9==2)
            {
              System.out.println("You decide to not open the chest and instead check the skeletons");
              System.out.println("You decide to check the skeletons and find a note with a message scribbled on it.");
              System.out.println("Only the one with the name Dovahkiin can tame the dragon");
            }
          }
        System.out.println("You decide to either sneak around or attack it.");
        System.out.println("Enter 1 to sneak around or 2 to attack it");
        int Ques11=ln.getInt();
        if(Ques11==1)
        {
          System.out.println("You decide to sneak around");
          System.out.println("You and Brandr crouch down and start moving past the bear.");
          System.out.println("You decide you can either sneak around slowly or quickly");
          System.out.println("Enter 1 to sneak around slowly or enter 2 to sneak around quickly");
          int Ques13=ln.getInt();
          if(Ques13==1)
          {
            System.out.println("You decide to sneak around slowly");
            System.out.println("You and Brandr walk slowly past the bear when you see one of its eyes open.");
            System.out.print("It looks right at you, wakes up and attacks.");
            if (weapon == 1)
            {
              AnimalSword(health, ammo);
            }
            if (weapon == 2)
            {
              AnimalDagger(health, ammo);
            }
            if (weapon == 3)
          {
              AnimalAxe(health, ammo);
            }
          }
          if(Ques13==2)
          {
            System.out.println("You decide to sneak around quickly");
             System.out.println("You and Brandr walk quickly past the bear when you see its eye open.");
             System.out.print("Its head lifts, it sniffs the air, then goes back to sleep.");
             System.out.print("You and Brandr manage to get by the bear.");
          }
        }
        if(Ques11==2)
        {
          System.out.println("You decide to attack it");
          System.out.println("You and Brandr sneak up behind the bear, the bear opens his eye and wakes up and attacks.");
          if (weapon == 1)
          {
            AnimalSword(health, ammo);
          }
          if (weapon == 2)
          {
            AnimalDagger(health, ammo);
          }
          if (weapon == 3)
          {
            AnimalAxe(health, ammo);
          }
        }
        
        System.out.println("You and Brandr see an opening at the end of the cave and manage to escape.");
        System.out.print("You step outside and take a breath of fresh air.");
        System.out.print("You start walking down the road and see a watchtower in the distance.");
        }
        System.out.print("You decide to go to the watchtower.");
        System.out.println("You and Brandr enter the old watchtower and start heading to the top to get a better view of the area.");
        System.out.print("As you're looking at the surrounding area you see the dragon come flying from behind a mountain!");
        System.out.print("The dragon lands right next to the watchtower.");
        System.out.print("The dragons the same height as the watchtower and stares you right in your eyes.");
        System.out.print("You can feel the dragons glare burning your soul.");
        String Dovahkiin="Dovahkiin";
        if(name.equals(Dovahkiin))
        {
          System.out.println("Will you talk to the Dragon?");
          System.out.println("Enter 1 to talk to the Dragon or 2 to fight it");
          int Ques14=ln.getInt();
          {
            if(Ques14==1)
            {
              System.out.println("You decide to speak with the Dragon");
                System.out.println("You can feel some kind of indescribable connection with the beast.");
                System.out.print("You stumble back in shock as the dragon begins talking.");
                System.out.print("It starts telling you that it can feel the dragon blood inside of you.");
                System.out.print("The mighty beast bows its head and tells you it will serve you until death.");
                System.out.print("You get on the dragon and fly away into the sunset.");
                System.out.println("The End");
                System.out.println("Special Ending!");
                System.exit(0);
            }
            if(Ques14==2)
            {
              System.out.println("You decide to fight the Dragon");
              System.out.print("The Dragon opens its mouth and burning flames come shooting out.");
              if (weapon == 1)
              {
                DragonSword(health, ammo);
              }
              if (weapon == 2)
              {
                DragonDagger(health, ammo);
              }
              if (weapon == 3)
              {
                DragonAxe(health, ammo);
              }
              System.out.print("The dragon falls lifelessly to the ground.");
            }
      }
    }
    if(!name.equals(Dovahkiin))
    {
      System.out.println("The Dragon attacks you");
      System.out.print("The Dragon opens its mouth and burning flames come shooting out.");
      if (weapon == 1)
              {
                DragonSword(health, ammo);
              }
              if (weapon == 2)
              {
                DragonDagger(health, ammo);
              }
              if (weapon == 3)
              {
                DragonAxe(health, ammo);
              }
              System.out.print("The dragon falls lifelessly to the ground.");
    }
    }
    if(GuardFight==1)
    {
      System.out.println("You see an arrow out of the corner of your eye fly right towards you.");
      System.out.println("You try to dodge it but it still manages to hit you in the arm.");
      System.out.println("You turn around fully and see that it was Brandr who is already nocking another arrow.");
      System.out.println("You start running towards him drawing your weapon.");
      System.out.print("In shock you ask him why hes doing this.");
      System.out.print("He tells you that he doesn't want to live on the run.");
      System.out.print("He wants to go back to his family and not be a prisoner anymore");
      System.out.print("He says that maybe if they think he killed the dragon he would be set free.");
      if (weapon == 1)
      {
        HumanSword(health);
      }
      if (weapon == 2)
      {
        HumanDagger(health);
      }
      if (weapon == 3)
      {
        HumanAxe(health);
      }
      System.out.println("You kill Brandr.");
      System.out.println("You look at the sunset, then continue down the road.");
      System.out.println("The End");
      System.out.println("You beat the game! Violent ending.");
    }
    if(GuardFight==2)
    {
      System.out.println("You hear an arrow being strung. As you turn around you see Brandr fire the arrow.");
      System.out.println("You dodge the arrow, and start running towards him with your weapon out.");
      System.out.print("You quickly dodge out of the way of another arrow.");
      System.out.print("In shock you ask him why hes doing this.");
      System.out.print("He tells you that he doesn't want to live on the run.");
      System.out.print("He wants to go back to his family and not be a prisoner anymore.");
      System.out.print("He says that maybe if they think he killed the dragon he would be set free.");
      System.out.println("You decide that you can either try to talk to him quickly or fight him.");
      System.out.println("Enter 1 to talk or 2 to fight");
      int Ques16=ln.getInt();
      if(Ques16==1)
      {
        System.out.println("You decide to talk to him");
        System.out.println("Brandr tells you to fight him.");
        int W17=0;
        while(W17==0)
        {
          System.out.println("Enter 1 to drop your weapons 2 to aim your weapons at 3 to persuade him or 4 to remain defensive");
          int Ques17=ln.getInt();
          if(Ques17==1)
          {
            System.out.println("You decide to drop your weapons");
            System.out.println("You drop your weapons and tell him you won't fight him.");
            System.out.print("Brandr raises his bow, but then drops it and decides that he can't kill you.");
            System.out.print("You continue down the road wondering what's to come.");
            System.out.println("The End.");
            System.out.println("You beat the game! Peaceful ending.");
            W17++;
          }
          if(Ques17==2)
          {
            System.out.println("You decide to aim your weapons at Brandr");
            System.out.println("You raise your weapon and prepare to fight.");
            if (weapon == 1)
            {
              HumanSword(health);
            }
            if (weapon == 2)
            {
              HumanDagger(health);
            }
            if (weapon == 3)
            {
              HumanAxe(health);
            }
            System.out.println("You kill Brandr.");
            System.out.println("You look at the sunset, then continue down the road.");
            System.out.println("The End");
            System.out.println("You beat the game! Neutral ending.");
            W17++;
          }
          if(Ques17==3)
          {
            System.out.println("You decide to persuade Brandr");
            System.out.println("You tell Brandr not to do it, that they wont believe he killed the dragon.");
            System.out.print("You tell him you can go get his family and they can live together again.");
            chance = (Math.random()*(10-1))+1;
          chance = Math.round(chance);
          if (chance <= 5)
          {
            System.out.println("Brandr drops his sword and agrees to continue with you.");
            System.out.print("You continue down the road wondering what's to come.");
            System.out.println("The End.");
            System.out.println("You beat the game! Peaceful ending.");
          }
          if (chance > 5)
          {
            System.out.println("Brandr says it's worth a try and attacks you.");
            if (weapon == 1)
            {
              HumanSword(health);
            }
            if (weapon == 2)
            {
              HumanDagger(health);
            }
            if (weapon == 3)
            {
              HumanAxe(health);
            }
            System.out.println("You kill Brandr.");
            System.out.println("You look at the sunset, then continue down the road.");
            System.out.println("The End");
            System.out.println("You beat the game! Neutral ending.");
            W17++;
          }
          if(Ques17==4)
          {
            System.out.println("You decide to remain defensive");
            System.out.println("You both stare at eachother waiting for the other to make a move");
          }
        }
      }
      if(Ques16==2)
      {
        System.out.println("You decide to fight him");
        if (weapon == 1)
        {
          HumanSword(health);
        }
        if (weapon == 2)
        {
          HumanDagger(health);
        }
        if (weapon == 3)
        {
          HumanAxe(health);
        }
         System.out.println("You kill Brandr.");
         System.out.println("You look at the sunset, then continue down the road.");
         System.out.println("The End");
         System.out.println("You beat the game! Neutral ending.");
      }
    }
    }
    }
    }
    
    if(Ques1==2)
    {
      System.out.println("You decide to jump off.");
      System.out.println("You jump off and break your ankle, you die.");
      System.out.println("Stupid Ending, Congrats!");
    }
  }
}
  



  

