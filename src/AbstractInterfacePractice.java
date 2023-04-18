public class AbstractInterfacePractice {
    public static void main(String[] args) {
        EmailNotificaiton emailNotificaiton = new EmailNotificaiton();
        System.out.println(emailNotificaiton.didOptIn());
    }
}

abstract class Notification {
    public abstract boolean didOptIn();
    public abstract String unsubscribedLink();
    public abstract String getPhysicalAddress();
    public abstract String getSenderInfo();
}

class EmailNotificaiton extends Notification{
    public boolean didOptIn() {
        return false;
    }

    public String unsubscribedLink() {
        return null;
    }

    public String getPhysicalAddress() {
        return null;
    }

    public String getSenderInfo() {
        return null;
    }

}
