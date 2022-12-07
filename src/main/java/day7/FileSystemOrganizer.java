package day7;

import lombok.experimental.UtilityClass;

import java.util.Comparator;
import java.util.List;


import static util.FileUtil.readFilePerLine;

@UtilityClass
public class FileSystemOrganizer {

    private static final int DISKSPACE = 70000000;
    private static final int SPACE_REQUIRED  = 30000000;
    private static final int MAX_SIZE_OF_SMALL_DIRECTORY = 100000;


    public static long findSumOfSmallDirectories(String fileName){
        var content = readFilePerLine(fileName);
        var directory = buildDirectoryTree(content);
        return directory.getSumOfSmallDirectories(MAX_SIZE_OF_SMALL_DIRECTORY);
    }

    public static long findMinimalSpaceToFreeUp(String fileName){
        var content = readFilePerLine(fileName);
        var root = buildDirectoryTree(content);
        long spaceNeeded =  SPACE_REQUIRED - (DISKSPACE - root.getSize());
        var toDelete = root.getAllBigChildDirectories(spaceNeeded).stream().sorted(Comparator.comparing(Directory::getSize)).findFirst().orElse(root);
        return toDelete.getSize();
    }

    private static Directory buildDirectoryTree(List<String> commands){
        var root = new Directory();
        var currentDirectory = root;
        for(String command: commands){
            if(command.equals("$ cd ..")){
                currentDirectory = currentDirectory.getParent();
            }
            else if(command.startsWith("$ cd")){
                var split = command.split(" ");
                currentDirectory = currentDirectory.getChild(split[2]);
            }
            else if(!command.equals("$ ls")){
                currentDirectory.addChild(command);
            }
        }
        return root;
    }

}
