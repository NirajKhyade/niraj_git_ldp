package KarateAssignment;


import com.intuit.karate.junit5.Karate;

// @KarateOptions(tags = {"@debug"})

class Test {
    
    
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
    
}


