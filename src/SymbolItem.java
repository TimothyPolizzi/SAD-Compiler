/**
 * A private item that is used to store symbols in the table.
 */
public class SymbolItem {

  private String var;
  private String type;
  private int scope;
  private int pos;

  /**
   * Creates a SymbolItem and requires the basic information of the symbol to be stored.
   *
   * @param var The string name and identifier of the variable that is to be stored.
   * @param type A string that shows the type of the variable stored.
   * @param scope The integer representing the scope that the variable is located in.
   * @param pos The integer containing the line number at which the symbol is represented on.
   */
  public SymbolItem(String var, String type, int scope, int pos) {
    this.var = var;
    this.type = type;
    this.scope = scope;
    this.pos = pos;
  }

  public String getVar() {
    return var;
  }

  public String getType() {
    return type;
  }

  public int getPos() {
    return pos;
  }

  public int getScope() {
    return scope;
  }

  /**
   * Returns the string of a SymbolItem
   *
   * @return The string containing the symbol item
   */
  public String toString() {
    return String.format("%1$-6s| %2$-6s| %3$-6d| %4$-6d", var, type, scope, pos);
  }
}