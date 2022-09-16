package test5;
enum Size
{
  SMALL("S"),MEDIUM("L"),LARGE("L"),EXTRA_LARGE("XL");

    private  String abbreviation;

    private Size(String abbreviation){
      this.abbreviation=abbreviation;
  }
    public String getAbbreviation() {
        return abbreviation;
    }
}
