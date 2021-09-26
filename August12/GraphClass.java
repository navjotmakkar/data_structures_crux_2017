package August12;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;



import July29.HeapClass;
import July31.GenericHeapClass;

public class GraphClass {
	private class vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, vertex> vces = new HashMap<>();

	public int numVertices() {
		return vces.size();
	}

	public boolean containVertex(String vname) {
		return vces.containsKey(vname);
	}

	public void addVertex(String vname) {
		if (!vces.containsKey(vname)) {
			vertex vtx = new vertex();
			vces.put(vname, vtx);
		}
	}

	public void removeVertex(String vname) {
		if (!vces.containsKey(vname))
			return;
		vertex vtx = vces.get(vname);
		ArrayList<String> nbrnames = new ArrayList<>(vtx.nbrs.keySet());
		for (String nbrname : nbrnames) {
			vertex nbrvtx = vces.get(nbrname);
			nbrvtx.nbrs.remove(vname);
		}
		vces.remove(vname);

	}

	public int numEdges(String v1name, String v2name) {
		int rv = 0;
		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		for (String vname : vnames) {
			vertex vtx = vces.get(vname);
			rv += vtx.nbrs.size();
		}
		return rv / 2;
	}

	public boolean containsEdge(String v1name, String v2name) {
		vertex vtx1 = vces.get(v1name);
		vertex vtx2 = vces.get(v2name);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(v2name) == false)
			return false;

		return true;
	}

	public void addEdge(String v1name, String v2name, int weight) {
		vertex vtx1 = vces.get(v1name);
		vertex vtx2 = vces.get(v2name);
		if (vtx1 == null || vtx2 == null)
			return;

		vtx1.nbrs.put(v2name, weight);
		vtx2.nbrs.put(v1name, weight);
	}

	public void removeEdge(String v1name, String v2name) {
		vertex vtx1 = vces.get(v1name);
		vertex vtx2 = vces.get(v2name);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(v2name) == false)
			return;

		vtx1.nbrs.remove(v2name);
		vtx2.nbrs.remove(v1name);
	}

	public void display() {
		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		String rv = "";
		for (String vname : vnames) {
			vertex vtx = vces.get(vname);
			rv = vname + "=>";
			ArrayList<String> nbrnames = new ArrayList<>(vtx.nbrs.keySet());
			for (String nbrname : nbrnames) {
				rv += nbrname + "{"+vtx.nbrs.get(nbrname)+"}, ";
			}
			System.out.println(rv);
		}
	}
	
	public boolean hasPath(String v1name, String v2name)
	{
		return hasPathHelper(v1name, v2name, new HashMap<>(),v1name);
	}

	private boolean hasPathHelper(String v1name, String v2name, HashMap<String, Boolean> processed, String psf) {
		
		if(processed.containsKey(v1name))
		{
			return false;
		}
		processed.put(v1name, true);
		
		vertex vtx1 = vces.get(v1name);
		if(vtx1.nbrs.containsKey(v2name))
		{
			System.out.println(psf+v2name);
			return true;
		}
		ArrayList<String> nbrnames = new ArrayList<>(vtx1.nbrs.keySet());
		for (String nbrname : nbrnames) {
			if(hasPathHelper(nbrname, v2name,processed,psf+nbrname))
				
				return true;
		}
		return false;
	}
	private class Pair
	{
		String vname;
		vertex vtx;
		String psf;
		Pair(String vname,vertex vtx,String psf)
		{
			this.vname=vname;
			this.vtx=vtx;
			this.psf=psf;
		}
	}
	public boolean bfs(String v1name,String v2name)
	{
		HashMap<String , Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		Pair rootpair=new Pair(v1name, vces.get(v1name), v1name);
		queue.addLast(rootpair);
		while(queue.size()!=0)
		{
			Pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname))
			{
				continue;
			}
				
			processed.put(rp.vname, true);
			
			System.out.println(rp.vname+"via path"+rp.psf);
			
			if(this.containsEdge(rp.vname, v2name)==true)
				return true;
			
			ArrayList<String> nbrnames=new ArrayList<>(rp.vtx.nbrs.keySet());
			for(String nbrname:nbrnames)
			{
				if(!processed.containsKey(nbrname))
				{
					Pair np=new Pair(nbrname, vces.get(nbrname), rp.psf+nbrname);
					queue.addLast(np);
				}
					
			}
			
		}
		return false;
		
	}

	public boolean dfs(String v1name,String v2name)
	{
		HashMap<String , Boolean> processed=new HashMap<>();
		LinkedList<Pair> stack=new LinkedList<>();
		Pair rootpair=new Pair(v1name, vces.get(v1name), v1name);
		stack.addFirst(rootpair);
		while(stack.size()!=0)
		{
			Pair rp=stack.removeFirst();
			if(processed.containsKey(rp.vname))
			{
				continue;
			}
				
			processed.put(rp.vname, true);
			
			System.out.println(rp.vname+"via path"+rp.psf);
			
			if(this.containsEdge(rp.vname, v2name)==true)
				return true;
			
			ArrayList<String> nbrnames=new ArrayList<>(rp.vtx.nbrs.keySet());
			for(String nbrname:nbrnames)
			{
				if(!processed.containsKey(nbrname))
				{
					Pair np=new Pair(nbrname, vces.get(nbrname), rp.psf+nbrname);
					stack.addFirst(np);
				}
					
			}
			
		}
		return false;
	
	}
	public void bft()
	{
		HashMap<String , Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		ArrayList<String> vnames=new ArrayList<>(vces.keySet());
		for (String vname:vnames) 
		{
			
			if (processed.containsKey(vname)) 
			{
				continue;
			}
			Pair rootpair=new Pair(vname, vces.get(vname), vname);
			queue.addLast(rootpair);
			while (queue.size() != 0) 
			{
				Pair rp = queue.removeFirst();
				if (processed.containsKey(rp.vname)) 
				{
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + "via path" + rp.psf);

				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) 
				{
					if (!processed.containsKey(nbrname)) 
					{
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						queue.addLast(np);
					}

				}

			} 
		}
	}
	public void dft()
	{
		HashMap<String , Boolean> processed=new HashMap<>();
		LinkedList<Pair> stack=new LinkedList<>();
		ArrayList<String> vnames=new ArrayList<>(vces.keySet());
		for (String vname:vnames) 
		{
			
			if (processed.containsKey(vname)) 
			{
				continue;
			}
			Pair rootpair=new Pair(vname, vces.get(vname), vname);
			stack.addFirst(rootpair);
			while (stack.size() != 0) 
			{
				Pair rp = stack.removeFirst();
				if (processed.containsKey(rp.vname)) 
				{
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + "via path" + rp.psf);

				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) 
				{
					if (!processed.containsKey(nbrname)) 
					{
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						stack.addFirst(np);
					}

				}

			} 
		}
		
		
	}
	public boolean isConnected()
	{
		HashMap<String , Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		ArrayList<String> vnames=new ArrayList<>(vces.keySet());
		int counter=0;
		for (String vname:vnames) 
		{
			
			if (processed.containsKey(vname)) 
			{
				continue;
			}
			counter++;
			Pair rootpair=new Pair(vname, vces.get(vname), vname);
			queue.addLast(rootpair);
			while (queue.size() != 0) 
			{
				Pair rp = queue.removeFirst();
				if (processed.containsKey(rp.vname)) 
				{
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + "via path" + rp.psf);

				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) 
				{
					if (!processed.containsKey(nbrname)) 
					{
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						queue.addLast(np);
					}

				}

			} 
		}
		return counter==1;
	}
	public boolean isCyclic()
	{
		HashMap<String , Boolean> processed=new HashMap<>();
		LinkedList<Pair> queue=new LinkedList<>();
		ArrayList<String> vnames=new ArrayList<>(vces.keySet());
		for (String vname:vnames) 
		{
			
			if (processed.containsKey(vname)) 
			{
				continue;
			}
			Pair rootpair=new Pair(vname, vces.get(vname), vname);
			queue.addLast(rootpair);
			while (queue.size() != 0) 
			{
				Pair rp = queue.removeFirst();
				if (processed.containsKey(rp.vname)) 
				{
					System.out.println(rp.vname + "via path" + rp.psf);
					return true;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + "via path" + rp.psf);

				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) 
				{
					if (!processed.containsKey(nbrname)) 
					{
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						queue.addLast(np);
					}

				}

			} 
		}
		return false;
	}
	public boolean isTree()
	{
		return this.isConnected() && !this.isCyclic();
	}
	
	
	public HashMap<String,djikstraPair> djikstra(String src)
	{
		HashMap<String, djikstraPair> map=new HashMap<>();
		GenericHeapClass<djikstraPair> heap=new GenericHeapClass<>(djikstraPair.ctor);
		
		ArrayList<String> vnames=new ArrayList<>(vces.keySet());
		for(String vname:vnames)
		{
			djikstraPair pair=new djikstraPair(vname, "", Integer.MAX_VALUE);
			if(pair.vname.equals(src))
			{
				pair.csf=0;
				pair.psf=vname;
			}
			heap.add(pair);
			map.put(vname, pair);
		}
		while(heap.size()!=0)
		{
			djikstraPair rp=heap.removeHP();
			ArrayList<String> nbrnames=new ArrayList<>(vces.get(rp.vname).nbrs.keySet());
			for(String nbrname:nbrnames)
			{
				int newcost=rp.csf+vces.get(rp.vname).nbrs.get(nbrname);
				int oldcost=map.get(nbrname).csf;
				if(newcost<oldcost)
				{
					djikstraPair dp=map.get(nbrname);
					dp.csf=newcost;
					dp.psf = rp.psf+nbrname;
					heap.updatePriority(dp);
				}
			}
		}
		return map;
	}
	private static class djikstraPair
	{
		String vname;
		int csf;
		String psf;
		
		private static final djikstraComparator ctor = new djikstraComparator();
		public static class djikstraComparator implements Comparator<djikstraPair>
		{
			@Override
			public int compare(djikstraPair arg0, djikstraPair arg1) {
				return arg1.csf-arg0.csf;
			};
		}
		private djikstraPair(String vname,String psf, int csf)
		{
			this.vname=vname;
			this.csf=csf;
			this.psf=psf;
		}
		public String toString()
		{
			return this.psf+"@"+this.csf;
		}

	}
	public GraphClass prims()
	{
		GraphClass gr=new GraphClass();
		HashMap<String, primsPair> map=new HashMap<>();
		GenericHeapClass<primsPair> heap=new GenericHeapClass<>(primsPair.ctor);
		
		ArrayList<String> vnames=new ArrayList<>(vces.keySet());
		for(String vname:vnames)
		{
			primsPair pair=new primsPair(vname, null, Integer.MAX_VALUE);
			heap.add(pair);
			map.put(vname, pair);
		}
		while(heap.size()!=0)
		{
			primsPair rp=heap.removeHP();
			if(rp.avname == null)
			{
				gr.addVertex(rp.vname);
			}
			else
			{
				gr.addVertex(rp.vname);
				gr.addEdge(rp.vname,rp.avname,rp.csf);
			}
			ArrayList<String> nbrnames=new ArrayList<>(vces.get(rp.vname).nbrs.keySet());
			for(String nbrname:nbrnames)
			{
				if(gr.containVertex(nbrname))
				{
					continue;
				}
				int newcost=vces.get(rp.vname).nbrs.get(nbrname);
				int oldcost=map.get(nbrname).csf;
				if(newcost<oldcost)
				{
					primsPair pp=map.get(nbrname);
					pp.csf=newcost;
					pp.avname=rp.vname;
					heap.updatePriority(pp);
				}
			}
		}
		return gr;
	}
	private static class primsPair
	{
		String vname;
		int csf;
		String avname; //accquire vertex name
		
		private static final primsComparator ctor = new primsComparator();
		public static class primsComparator implements Comparator<primsPair>
		{
			@Override
			public int compare(primsPair arg0, primsPair arg1) {
				return arg1.csf-arg0.csf;
			};
		}
		private primsPair(String vname,String psf, int csf)
		{
			this.vname=vname;
			this.csf=csf;
			this.avname=avname;
		}
	}
}
