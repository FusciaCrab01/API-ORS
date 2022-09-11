import java.util.*;

public class HistoryModule extends ORS {



    public HistoryModule()
    {

    }


	public void Search()
	{
		Scanner in = new Scanner(System.in);
		boolean Hcondition = true;
		do{

			System.out.print("Search  : ");
			String search = in.nextLine();

			System.out.println("\tType\t\t Section To\t\t Section From\t\t Purpose\t\t" +
				 "Date Forwarded\t\t Date Received");
			for(int x = 0; x<counterUp; x++)
			{
				if( DateForward[x].toUpperCase().contains(search.toUpperCase()) ||
					DateReceived[x].toUpperCase().contains(search.toUpperCase()) ||
					UType[x].toUpperCase().contains(search.toUpperCase()) ||
					UPurpose[x].toUpperCase().contains(search.toUpperCase()) ||
					OfficeTo[x].toUpperCase().contains(search.toUpperCase()) ||
					OfficeFrom[x].toUpperCase().contains(search.toUpperCase()) )
				{
					System.out.print(UType[x] + "\t\t" + OfficeTo[x] + "\t\t" +
						OfficeFrom[x] + "\t\t" + UPurpose[x] + "\t\t" +
							DateForward[x] + "\t\t" + DateReceived[x]  );
				}
			}

			Hcondition = false;


		}while(Hcondition);
	}

	public void Sort(String T[], String P[], String OF[], String OT[], String DF[], String DR[] )
	{
	Scanner in = new Scanner  (System.in);
	System.out.println("[1] Type\n[2] Purpose\n[3] Date Forward\n[4] Date Received\n[5] Office From\n[6] Office To");
	System.out.print("You want to sort by : ");
	int Hchoi = in.nextInt();

	String [] newType = new String [counterUp];
	String [] newPurpose = new String [counterUp];
	String [] newFrom = new String [counterUp];
	String [] newTo = new String [counterUp];
	String [] newRece = new String [counterUp];
	String [] newForw = new String [counterUp];

	newType = T;
	newPurpose =P;
	newFrom = OF;
	newTo = OT;
	newRece = DR;
	newForw = DF;

	List<String> Type = Arrays.asList(newType);
	List<String> Purpose = Arrays.asList(newPurpose);
	List<String> OffFrom = Arrays.asList(newFrom);
	List<String> OffTo = Arrays.asList(newTo);
	List<String> DateF = Arrays.asList(newForw);
	List<String> DateR = Arrays.asList(newRece);
//	List<Integer> OffToC = new ArrayList<Integer>(OTC.length);
//	for (int i : OTC)
//	{
//		OffToC.add(i);
//	}
//	List<Integer> OffFromC = new ArrayList<Integer>(OFC.length);
//	for (int i : OFC)
//	{
//		OffFromC.add(i);
//	}

	if(Hchoi == 1)
	{
		concurrentSort(Type, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);

	}
	else if (Hchoi == 2)
	{
		concurrentSort(Purpose, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 3)
	{
		concurrentSort(DateF, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 4)
	{
		concurrentSort(DateR, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 5)
	{
		concurrentSort(OffFrom, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	else if (Hchoi == 6)
	{
		concurrentSort(OffTo, Type,Purpose,OffFrom,OffTo,DateF,DateR);
		System.out.println("Type          : "+Type);
		System.out.println("Purpose       : "+Purpose);
		System.out.println("Office From   : "+OffFrom);
		System.out.println("Office To     : "+OffTo);
		System.out.println("Date Received : "+DateR);
		System.out.println("Date Forward  :	"+DateF);
	}
	}

	public static <T extends Comparable<T>> void concurrentSort(final List<T> key, List<?> ... lists)
	{
		//Create List Indices
		List<Integer> indices = new ArrayList<Integer>();
		for(int i = 0; i<key.size(); i++)
			indices.add(i);

		//Sort the indices list based on the key
		Collections.sort(indices, new Comparator<Integer>(){
		@Override public int compare(Integer i, Integer j)
		{
			return key.get(i).compareTo(key.get(j));
		}
		});

		Map<Integer,Integer> swapMap = new HashMap<Integer, Integer>(indices.size());
		List<Integer>swapFrom = new ArrayList<Integer>(indices.size()),
					 swapTo   = new ArrayList<Integer>(indices.size());
		for(int i = 0; i<key.size(); i++)
		{
			int k = indices.get(i);
			while(i != k && swapMap.containsKey(k))
				k = swapMap.get(k);

				swapFrom.add(i);
				swapTo.add(k);
				swapMap.put(i , k);
		}

		for(List<?> list : lists)
			for(int i=0; i<list.size(); i++)
				Collections.swap(list, swapFrom.get(i), swapTo.get(i));

	}
}