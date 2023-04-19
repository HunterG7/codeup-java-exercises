package arrayListPractice;

import java.util.ArrayList;
import java.util.Comparator;

public class CodingLanguage {
    private String name;
    private int createdDate;
    private String creator;

    public CodingLanguage(String name, int createdDate, String creator) {
        this.name = name;
        this.createdDate = createdDate;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(int createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public static void main(String[] args) {

        ArrayList<CodingLanguage> codingLanguages = new ArrayList<>();

        CodingLanguage java = new CodingLanguage("Java", 1995, "Sun Microsystems");
        codingLanguages.add(java);

        CodingLanguage python = new CodingLanguage("Python", 1991, "Guido van Rossum");
        codingLanguages.add(python);

        CodingLanguage javascript = new CodingLanguage("JavaScript", 1995, "Netscape Communications Corporation");
        codingLanguages.add(javascript);

        CodingLanguage c = new CodingLanguage("C", 1972, "Dennis Ritchie");
        codingLanguages.add(c);

        CodingLanguage cPlusPlus = new CodingLanguage("C++", 1983, "Bjarne Stroustrup");
        codingLanguages.add(cPlusPlus);

        CodingLanguage go = new CodingLanguage("Go", 2009, "Google");
        codingLanguages.add(go);

        CodingLanguage swift = new CodingLanguage("Swift", 2014, "Apple Inc.");
        codingLanguages.add(swift);

        CodingLanguage rust = new CodingLanguage("Rust", 2010, "Mozilla Foundation");
        codingLanguages.add(rust);

        CodingLanguage kotlin = new CodingLanguage("Kotlin", 2011, "JetBrains");
        codingLanguages.add(kotlin);

        CodingLanguage ruby = new CodingLanguage("Ruby", 1995, "Yukihiro Matsumoto");
        codingLanguages.add(ruby);

        CodingLanguage php = new CodingLanguage("PHP", 1995, "Rasmus Lerdorf");
        codingLanguages.add(php);

        CodingLanguage objectiveC = new CodingLanguage("Objective-C", 1983, "Brad Cox");
        codingLanguages.add(objectiveC);

        CodingLanguage sql = new CodingLanguage("SQL", 1974, "IBM");
        codingLanguages.add(sql);

        CodingLanguage swiftObjectiveC = new CodingLanguage("Swift/Obj-C", 2014, "Apple Inc.");
        codingLanguages.add(swiftObjectiveC);

        CodingLanguage perl = new CodingLanguage("Perl", 1987, "Larry Wall");
        codingLanguages.add(perl);

        CodingLanguage groovy = new CodingLanguage("Groovy", 2003, "James Strachan");
        codingLanguages.add(groovy);

        CodingLanguage scala = new CodingLanguage("Scala", 2004, "Martin Odersky");
        codingLanguages.add(scala);

        CodingLanguage lua = new CodingLanguage("Lua", 1993, "Roberto Ierusalimschy");
        codingLanguages.add(lua);

        CodingLanguage r = new CodingLanguage("R", 1993, "Ross Ihaka and Robert Gentleman");
        codingLanguages.add(r);

//        for (CodingLanguage codingLanguage : codingLanguages){
//            System.out.printf("%s was created in %s by %s.%n", codingLanguage.getName(), codingLanguage.getCreatedDate(),
//            codingLanguage.getCreator());
//        }

//        codingLanguages.sort(Comparator.comparing(CodingLanguage::getName));
//        for (CodingLanguage codingLanguage : codingLanguages){
//            System.out.println(codingLanguage.getName());
//        }

        codingLanguages.sort(Comparator.comparing(CodingLanguage::getCreatedDate));
        for (CodingLanguage codingLanguage : codingLanguages){
            System.out.println(codingLanguage.getName() + " : " + codingLanguage.getCreatedDate());
        }
    }



}