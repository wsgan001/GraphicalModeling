package model.learning.distributions;

import lombok.Setter;
import model.nodes.FactorNode;

/**
 * Created by Evan on 4/29/2017.
 */
public class DirichletCreator extends DistributionCreator {
    protected double alpha;
    public DirichletCreator(double alpha) {
        this.alpha=alpha;
    }

    @Override
    public Distribution create(FactorNode factor) {
        Dirichlet dirichlet = new Dirichlet(factor,alpha);
        dirichlet.initialize();
        return dirichlet;
    }
}
