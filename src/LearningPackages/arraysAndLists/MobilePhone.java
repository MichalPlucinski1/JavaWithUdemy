package LearningPackages.arraysAndLists;

import java.util.ArrayList;



public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
//        System.out.println("trying to add " + contact.getName() + " " + contact.getPhoneNumber());
//        printContacts();
        if(findContact(contact) >= 0 || findContact(contact.getName()) >= 0 ){
//            System.out.println("not added");
            return false;
        }
        myContacts.add(contact);
//        System.out.println("effect: added\n");
        return true;
    }

    public boolean updateContact(Contact old, Contact changed){
        int oldId = findContact(old);
        if(oldId < 0){
            return false;
        }
        myContacts.set(oldId, changed);
        return true;
    }

    public boolean removeContact(Contact contact){

        if(findContact(contact) < 0){
            return false;
        }
        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (Contact contact:myContacts) {
            if(name.equals(contact.getName())){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        //System.out.println("looking for " + name);
        //printContacts();
        for (Contact contact:myContacts) {
            if(name.equals(contact.getName())){
                return contact;
            }
        }
        return null;

    }

    public void printContacts(){
        int i = 1;
        System.out.println("Contact List:");
        for (Contact contact:myContacts) {
            System.out.println(i + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            i++;
        }
    }

    public static void main(String[]args){
        Contact c1 = new Contact("Mi", "777");
        Contact c2 = new Contact("Fi", "821");
        Contact c3 = new Contact("Li", "811");
        Contact c4 = new Contact("Di", "852");
        Contact c5 = new Contact("Qi", "822");

        MobilePhone mobilePhone = new MobilePhone("111");
        System.out.println(mobilePhone.addNewContact(c1));
        System.out.println(mobilePhone.addNewContact(c2));
        System.out.println(mobilePhone.addNewContact(c2));

        mobilePhone.printContacts();


    }

}
