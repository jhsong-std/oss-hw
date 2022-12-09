public class main {
    public static void main(String[] args) {
    
    // Fighter 객체를 하나 만들고, 
    Fighter figher1 = new Warrior();
    fighter1.attack();
    fighter1.defend();
    fighter1.escape();

    
    Wizard wizard = new Wizard();
    WizardAdapter wizardAdapter = new WizardAdapter(wizard); 
    wizardAdapter.attack(); 
    wizardAdapter.defend(); 
    wizardAdapter.escape();
    } 
}
