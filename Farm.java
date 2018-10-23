class Farm 
{     
   private Animal[] aBunchofAnimals;
   public Farm()
   {
   	aBunchofAnimals = new Animal[3];
   	aBunchofAnimals[0] = new Cow("cow", "moo");
   	aBunchofAnimals[1] = new Chick("chick", "cluck");
   	aBunchofAnimals[2] = new Pig("pig", "oink");
   }
   public void animalSounds()
   {
   	for(int nI = 0; nI < aBunchofAnimals.length; nI++)
   	{
   		System.out.println(aBunchofAnimals[nI].getType() + "goes" + aBunchofAnimals[nI].getSound());
   	}
   }
}
