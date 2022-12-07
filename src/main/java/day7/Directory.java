package day7;

import lombok.Data;
import lombok.ToString;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@ToString(exclude = "parent")
public class Directory {

    private Directory parent;
    private HashMap<String, Directory> children;
    private List<File> files;
    private String name;
    private long size;

    public Directory(Directory parent, String name){
        this.parent = parent;
        this.children = new HashMap<>();
        this.files = new ArrayList<>();
        this.name = name;
    }

    public List<Directory> getAllBigChildDirectories(long spaceNeeded){
        List<Directory> directories = new ArrayList<>();
        children.values().forEach(child -> directories.addAll(child.getAllBigChildDirectories(spaceNeeded)));
        if(this.size >= spaceNeeded){
            directories.add(this);
        }
        return directories;
    }

    public long getSumOfSmallDirectories(long maxSize){
        long sum  = children.values().stream().map(c -> c.getSumOfSmallDirectories(maxSize)).reduce(0l, Long :: sum);
        if(this.size < maxSize){
            sum += this.size;
        }
        return sum;
    }

    public Directory getChild(String name){
        return children.get(name);
    }

    public Directory(){
        this(null, "root");
    }

   public void addChild(String child){
       var split =  child.split(" ");
       if(split[0].equals("dir")){
           var directoryName = split[1];
           var newDirectory = new Directory(this, split[1]);
           children.put(directoryName, newDirectory);
       }
       else{
           var fileSize = Long.parseLong(split[0]);
           var file = new File(split[1], fileSize);
           files.add(file);
           addToSize(fileSize);
       }
   }

   protected void addToSize(long size){
        this.size += size;
        if(parent != null){
            parent.addToSize(size);
        }
   }

}
