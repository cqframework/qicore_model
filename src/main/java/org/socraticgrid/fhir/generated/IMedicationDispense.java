package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.MedicationDispenseStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
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
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IMedicationDispense
{

   public MedicationDispense getAdaptee();

   public void setAdaptee(MedicationDispense param);

   public SimpleQuantityDt getQuantity();

   public IMedicationDispense setQuantity(SimpleQuantityDt param);

   public IdDt getId();

   public IMedicationDispense setId(IdDt param);

   public Practitioner getDispenserResource();

   public IMedicationDispense setDispenserResource(Practitioner param);

   public StringDt getNoteElement();

   public String getNote();

   public IMedicationDispense setNote(String param);

   public IMedicationDispense setNote(StringDt param);

   public DateTimeDt getWhenPreparedElement();

   public Date getWhenPrepared();

   public IMedicationDispense setWhenPrepared(Date param);

   public IMedicationDispense setWhenPrepared(DateTimeDt param);

   public MedicationDispense.Substitution getSubstitution();

   public IMedicationDispense setSubstitution(
         MedicationDispense.Substitution param);

   public List<MedicationDispense.DosageInstruction> getDosageInstruction();

   public IMedicationDispense setDosageInstruction(
         List<MedicationDispense.DosageInstruction> param);

   public IMedicationDispense addDosageInstruction(
         MedicationDispense.DosageInstruction param);

   public MedicationDispense.DosageInstruction addDosageInstruction();

   public MedicationDispense.DosageInstruction getDosageInstructionFirstRep();

   public ContainedDt getContained();

   public IMedicationDispense setContained(ContainedDt param);

   public String getStatus();

   public IMedicationDispense setStatus(String param);

   public IMedicationDispense setStatus(MedicationDispenseStatusEnum param);

   public BoundCodeDt<MedicationDispenseStatusEnum> getStatusElement();

   public IMedicationDispense setStatus(
         BoundCodeDt<MedicationDispenseStatusEnum> param);

   public CodeableConceptDt getType();

   public IMedicationDispense setType(CodeableConceptDt param);

   public SimpleQuantityDt getDaysSupply();

   public IMedicationDispense setDaysSupply(SimpleQuantityDt param);

   public DateTimeDt getWhenHandedOverElement();

   public Date getWhenHandedOver();

   public IMedicationDispense setWhenHandedOver(Date param);

   public IMedicationDispense setWhenHandedOver(DateTimeDt param);

   public IdentifierDt getIdentifier();

   public IMedicationDispense setIdentifier(IdentifierDt param);

   public Location getDestinationResource();

   public IMedicationDispense setDestinationResource(Location param);

   public NarrativeDt getText();

   public IMedicationDispense setText(NarrativeDt param);

   public CodeDt getLanguage();

   public IMedicationDispense setLanguage(CodeDt param);

   public Patient getPatientResource();

   public IMedicationDispense setPatientResource(Patient param);

   public BoundCodeableConceptDt getMedicationCodeableConcept();

   public IMedicationDispense setMedicationCodeableConcept(
         BoundCodeableConceptDt param);

   public ResourceReferenceDt getMedicationReference();

   public IMedicationDispense setMedicationReference(ResourceReferenceDt param);
}