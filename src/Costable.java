

// Interface class: Like a contract
//
// Total abstraction
//
// declare constant fields
// declare methods that abstract by default.
//


// Keyword: Interface
public interface Costable {
//public abstract interface Costable {

    // All classes are abstract (by default)
    public abstract double cost();
    
    // If you have variables, they are all final
    public final double DOLLAR_RATE = 2;
    
}
