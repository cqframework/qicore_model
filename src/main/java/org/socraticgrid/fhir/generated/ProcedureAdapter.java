package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IProcedure;
import ca.uhn.fhir.model.dstu2.resource.Procedure;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class ProcedureAdapter implements IProcedure
{

   private Procedure adaptedClass = null;

   public ProcedureAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Procedure();
   }

   public ProcedureAdapter(Procedure adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Procedure getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Procedure param)
   {
      this.adaptedClass = param;
   }

   public Location getLocationResource()
   {
      if (adaptedClass.getLocation().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass
               .getLocation().getResource();
      }
      else
      {
         return null;
      }
   }

   public IProcedure setLocationResource(Location param)
   {
      adaptedClass.getLocation().setResource(param);
      return this;
   }

   public CodeableConceptDt getOutcome()
   {
      return adaptedClass.getOutcome();
   }

   public IProcedure setOutcome(CodeableConceptDt param)
   {
      adaptedClass.setOutcome(param);
      return this;
   }

   public List<Procedure.FocalDevice> getFocalDevice()
   {
      return adaptedClass.getFocalDevice();
   }

   public IProcedure setFocalDevice(List<Procedure.FocalDevice> param)
   {
      adaptedClass.setFocalDevice(param);
      return this;
   }

   public IProcedure addFocalDevice(Procedure.FocalDevice param)
   {
      adaptedClass.addFocalDevice(param);
      return this;
   }

   public Procedure.FocalDevice addFocalDevice()
   {
      ca.uhn.fhir.model.dstu2.resource.Procedure.FocalDevice item = new ca.uhn.fhir.model.dstu2.resource.Procedure.FocalDevice();
      adaptedClass.addFocalDevice(item);
      return item;
   }

   public Procedure.FocalDevice getFocalDeviceFirstRep()
   {
      return adaptedClass.getFocalDeviceFirstRep();
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IProcedure setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IProcedure addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public CodeableConceptDt getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IProcedure setCategory(CodeableConceptDt param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public DateTimeDt getPerformedDateTimeElement()
   {
      if (adaptedClass.getPerformed() != null
            && adaptedClass.getPerformed() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getPerformed();
      }
      else
      {
         return null;
      }
   }

   public Date getPerformedDateTime()
   {
      if (adaptedClass.getPerformed() != null
            && adaptedClass.getPerformed() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getPerformed()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IProcedure setPerformedDateTime(DateTimeDt param)
   {
      adaptedClass.setPerformed(param);
      return this;
   }

   public IProcedure setPerformedDateTime(Date param)
   {
      adaptedClass.setPerformed(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public PeriodDt getPerformedPeriod()
   {
      if (adaptedClass.getPerformed() != null
            && adaptedClass.getPerformed() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getPerformed();
      }
      else
      {
         return null;
      }
   }

   public IProcedure setPerformedPeriod(PeriodDt param)
   {
      adaptedClass.setPerformed(param);
      return this;
   }

   public List<Procedure.Performer> getPerformer()
   {
      return adaptedClass.getPerformer();
   }

   public IProcedure setPerformer(List<Procedure.Performer> param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public IProcedure addPerformer(Procedure.Performer param)
   {
      adaptedClass.addPerformer(param);
      return this;
   }

   public Procedure.Performer addPerformer()
   {
      ca.uhn.fhir.model.dstu2.resource.Procedure.Performer item = new ca.uhn.fhir.model.dstu2.resource.Procedure.Performer();
      adaptedClass.addPerformer(item);
      return item;
   }

   public Procedure.Performer getPerformerFirstRep()
   {
      return adaptedClass.getPerformerFirstRep();
   }

   public List<AnnotationDt> getNotes()
   {
      return adaptedClass.getNotes();
   }

   public IProcedure setNotes(List<AnnotationDt> param)
   {
      adaptedClass.setNotes(param);
      return this;
   }

   public IProcedure addNotes(AnnotationDt param)
   {
      adaptedClass.addNotes(param);
      return this;
   }

   public AnnotationDt addNotes()
   {
      ca.uhn.fhir.model.dstu2.composite.AnnotationDt item = new ca.uhn.fhir.model.dstu2.composite.AnnotationDt();
      adaptedClass.addNotes(item);
      return item;
   }

   public AnnotationDt getNotesFirstRep()
   {
      return adaptedClass.getNotesFirstRep();
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IProcedure setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public BoundCodeableConceptDt getReasonCodeableConcept()
   {
      if (adaptedClass.getReason() != null
            && adaptedClass.getReason() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getReason();
      }
      else
      {
         return null;
      }
   }

   public IProcedure setReasonCodeableConcept(BoundCodeableConceptDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public ResourceReferenceDt getReasonReference()
   {
      if (adaptedClass.getReason() != null
            && adaptedClass.getReason() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getReason();
      }
      else
      {
         return null;
      }
   }

   public IProcedure setReasonReference(ResourceReferenceDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IProcedure setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public BooleanDt getNotPerformedElement()
   {
      return adaptedClass.getNotPerformedElement();
   }

   public Boolean getNotPerformed()
   {
      return adaptedClass.getNotPerformed();
   }

   public IProcedure setNotPerformed(Boolean param)
   {
      adaptedClass.setNotPerformed(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IProcedure setNotPerformed(BooleanDt param)
   {
      adaptedClass.setNotPerformed(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IProcedure setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum
                  .valueOf(param));
      return this;
   }

   public IProcedure setStatus(ProcedureStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<ProcedureStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IProcedure setStatus(BoundCodeDt<ProcedureStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IProcedure setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public Encounter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getEncounter().getResource();
      }
      else
      {
         return null;
      }
   }

   public IProcedure setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IProcedure setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IProcedure setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }
}