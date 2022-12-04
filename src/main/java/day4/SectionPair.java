package day4;

public class SectionPair {

    public Section firstSection;
    public Section secondSection;

    public SectionPair(String sections){
        var pair = sections.split(",");
        firstSection = new Section(pair[0]);
        secondSection = new Section(pair[1]);
    }

    public boolean hasFullOverlap(){
        return fullyContainedBy(firstSection, secondSection) || fullyContainedBy(secondSection, firstSection);
    }

    public boolean hasOverlap(){
        return doesLeftSectionOverlap(firstSection, secondSection) || doesLeftSectionOverlap(secondSection, firstSection);
    }

    private static boolean fullyContainedBy(Section outerSection, Section innerSection){
        return innerSection.getStart() >= outerSection.getStart() && innerSection.getEnd() <= outerSection.getEnd();
    }

    private static boolean doesLeftSectionOverlap(Section leftSection, Section rightSection){
        return   leftSection.getEnd() >= rightSection.getStart()  && leftSection.getStart() <= rightSection.getStart();
    }

}
