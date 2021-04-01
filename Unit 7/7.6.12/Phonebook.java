import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<PhoneNumber> book = new ArrayList<PhoneNumber>();
    
    public void addNumber(PhoneNumber n)
    {
        book.add(n);
        sort();
    }
    public void sort()
    {
        for (int i = 0; i < book.size()-1; i++)
        {
            int minIndex = i;
            for(int j = i; j < book.size(); j++)
            {
                if(book.get(j).getName().compareTo(book.get(minIndex).getName()) < 0)
                    minIndex = j;
            }
            PhoneNumber temp = book.get(i);
            book.set(i, book.get(minIndex) );
            book.set(minIndex, temp);
        }
    }
    
    public void printPhoneBook()
    {
        for(PhoneNumber i : book)
        {
            System.out.println(i.getName());
        }
    }
}
