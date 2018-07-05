package day3;

public class Address
{
int roadno;
String city,state,country;
public Address(int roadno, String city, String state, String country)
{

	this.roadno = roadno;
	this.city = city;
	this.state = state;
	this.country = country;
}
@Override                          //go to source to generate directly
public String toString()
{
	return "Address [roadno=" + roadno + ", city=" + city + ", state=" + state +
			", country=" + country + "]";
}

}
