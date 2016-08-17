package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.SpecimenStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface ISpecimen
{

   public Specimen getAdaptee();

   public void setAdaptee(Specimen param);

   public NarrativeDt getText();

   public ISpecimen setText(NarrativeDt param);

   public List<Specimen.Treatment> getTreatment();

   public ISpecimen setTreatment(List<Specimen.Treatment> param);

   public ISpecimen addTreatment(Specimen.Treatment param);

   public Specimen.Treatment addTreatment();

   public Specimen.Treatment getTreatmentFirstRep();

   public CodeDt getLanguage();

   public ISpecimen setLanguage(CodeDt param);

   public Specimen.Collection getCollection();

   public ISpecimen setCollection(Specimen.Collection param);

   public List<Specimen.Container> getContainer();

   public ISpecimen setContainer(List<Specimen.Container> param);

   public ISpecimen addContainer(Specimen.Container param);

   public Specimen.Container addContainer();

   public Specimen.Container getContainerFirstRep();

   public IdentifierDt getAccessionIdentifier();

   public ISpecimen setAccessionIdentifier(IdentifierDt param);

   public ContainedDt getContained();

   public ISpecimen setContained(ContainedDt param);

   public DateTimeDt getReceivedTimeElement();

   public Date getReceivedTime();

   public ISpecimen setReceivedTime(Date param);

   public ISpecimen setReceivedTime(DateTimeDt param);

   public CodeableConceptDt getType();

   public ISpecimen setType(CodeableConceptDt param);

   public IdDt getId();

   public ISpecimen setId(IdDt param);

   public String getStatus();

   public ISpecimen setStatus(String param);

   public ISpecimen setStatus(SpecimenStatusEnum param);

   public BoundCodeDt<SpecimenStatusEnum> getStatusElement();

   public ISpecimen setStatus(BoundCodeDt<SpecimenStatusEnum> param);

   public List<IdentifierDt> getIdentifier();

   public ISpecimen setIdentifier(List<IdentifierDt> param);

   public ISpecimen addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();
}