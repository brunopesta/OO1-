package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
	private String strategy;
	private List <JobDescription> lista;
	
	
	public JobScheduler () {
		lista = new ArrayList<JobDescription>();}
	
	
	public List<JobDescription> getJobs(){
		return this.lista;
	}
	public void schedule (JobDescription job) {
		lista.add(job);
	}
	public void unschedule (JobDescription job) {
		if (job != null) {
			lista.remove(job);
		}
	}
	
	public String getStrategy() {
		return this.strategy;
	}
	
	public void setStrategy(String unstra) {
		this.strategy = unstra;
	}
	
	public JobDescription next() {
        JobDescription nextJob = null;

        switch (strategy) {
        case "FIFO":     // first in first out -> saca el primero de la lista de jobs
            nextJob = lista.get(0);
            this.unschedule(nextJob); // lo remueve de la lista si es != a null
            return nextJob;

        case "LIFO":  // last in first out -> saca el ultimo de la lista y ap[l[ica el unschedule de nuevo 
            nextJob = lista.get(lista.size()-1);
            this.unschedule(nextJob);
            return nextJob;

        case "HighestPriority": // mayor prioridad ->  agarra la lsita de jobs, lo convierte en stream  y dentro hace un compare entre las prioridades de los 2 trabajos, 
                                //sino retorna null
            nextJob = lista.stream().max((j1,j2) -> Double.compare(j1.priority(), j2.priority())).orElse(null);
            this.unschedule(nextJob);
            return nextJob;

        case "MostEffort": // mayor esfuerzo -> igual al anterior pero comparando por esfuerzo no por prioridad
             nextJob = lista.stream().max((j1,j2) -> Double.compare(j1.effort(), j2.effort())).orElse(null);
            this.unschedule(nextJob);
            return nextJob;

        }
          return null;
    }
}
