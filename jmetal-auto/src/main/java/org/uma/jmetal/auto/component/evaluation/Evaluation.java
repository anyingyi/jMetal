package org.uma.jmetal.auto.component.evaluation;

import org.uma.jmetal.auto.util.observable.ObservableEntity;
import org.uma.jmetal.solution.Solution;

import java.util.List;

public interface Evaluation<S extends Solution<?>> extends ObservableEntity {
  List<S> evaluate(List<S> solutionList) ;
}
