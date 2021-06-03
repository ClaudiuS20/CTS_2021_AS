package ro.ase.cts.tests.mocks;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.tests.TesteGrupa;
import ro.ase.cts.tests.TesteGrupaFixture;
import ro.ase.cts.tests.TesteGrupaMock;
import ro.ase.cts.tests.categories.GetPromovabilitateCategory;
import ro.ase.cts.tests.categories.TesteUrgenteCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({TesteGrupaMock.class, TesteGrupaFixture.class, TesteGrupa.class})
@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgenteCategory.class)
public class SuitaCustom {

}
