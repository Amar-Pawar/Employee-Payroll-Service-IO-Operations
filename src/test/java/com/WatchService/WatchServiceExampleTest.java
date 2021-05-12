package com.WatchService;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class WatchServiceExampleTest 
{
    
    @Test
    public void givenDirectoryWhenWatchedListsAllTheActivites() throws IOException
    {
       Path dir=Paths.get("C:/Users/www.abcom.in/Batch284/TerminalCommands/abc");
       Files.list(dir).filter(Files::isRegularFile).forEach(System.out ::println);
       new WatchServiceExample(dir);
       
    }
}