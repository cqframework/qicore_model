package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreProcedure;
import ca.uhn.fhir.model.dstu2.resource.Procedure;
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
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreProcedureAdapter implements IQICoreProcedure
{

   private Procedure adaptedClass = null;

   public QICoreProcedureAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Procedure();
   }

   public QICoreProcedureAdapter(Procedure adaptee)
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

   public QICoreLocationAdapter getLocationResource()
   {
      if (adaptedClass.getLocation().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location)
      {
         org.socraticgrid.fhir.generated.QICoreLocationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreLocationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass
                     .getLocation().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedure setLocationResource(QICoreLocationAdapter param)
   {
      adaptedClass.getLocation().setResource(param.getAdaptee());
      return this;
   }

   public CodeableConceptDt getOutcome()
   {
      return adaptedClass.getOutcome();
   }

   public IQICoreProcedure setOutcome(CodeableConceptDt param)
   {
      adaptedClass.setOutcome(param);
      return this;
   }

   public List<Procedure.FocalDevice> getFocalDevice()
   {
      return adaptedClass.getFocalDevice();
   }

   public IQICoreProcedure setFocalDevice(List<Procedure.FocalDevice> param)
   {
      adaptedClass.setFocalDevice(param);
      return this;
   }

   public IQICoreProcedure addFocalDevice(Procedure.FocalDevice param)
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

   public IQICoreProcedure setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreProcedure addIdentifier(IdentifierDt param)
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

   public IQICoreProcedure setCategory(CodeableConceptDt param)
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

   public IQICoreProcedure setPerformedDateTime(DateTimeDt param)
   {
      adaptedClass.setPerformed(param);
      return this;
   }

   public IQICoreProcedure setPerformedDateTime(Date param)
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

   public IQICoreProcedure setPerformedPeriod(PeriodDt param)
   {
      adaptedClass.setPerformed(param);
      return this;
   }

   public List<Procedure.Performer> getPerformer()
   {
      return adaptedClass.getPerformer();
   }

   public IQICoreProcedure setPerformer(List<Procedure.Performer> param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public IQICoreProcedure addPerformer(Procedure.Performer param)
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

   public IQICoreProcedure setNotes(List<AnnotationDt> param)
   {
      adaptedClass.setNotes(param);
      return this;
   }

   public IQICoreProcedure addNotes(AnnotationDt param)
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

   public IQICoreProcedure setText(NarrativeDt param)
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

   public IQICoreProcedure setReasonCodeableConcept(
         BoundCodeableConceptDt param)
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

   public IQICoreProcedure setReasonReference(ResourceReferenceDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public DateTimeDt getIncisionDateTime()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedure-incisionDateTime");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for incisionDateTime");
      }
   }

   public IQICoreProcedure setIncisionDateTime(DateTimeDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/procedure-incisionDateTime",
                  param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreProcedure setId(IdDt param)
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

   public IQICoreProcedure setNotPerformed(Boolean param)
   {
      adaptedClass.setNotPerformed(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IQICoreProcedure setNotPerformed(BooleanDt param)
   {
      adaptedClass.setNotPerformed(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreProcedure setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreProcedure setStatus(ProcedureStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<ProcedureStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreProcedure setStatus(BoundCodeDt<ProcedureStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IQICoreProcedure setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public List<ResourceReferenceDt> getApproachBodySite() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedure-approachBodySite");
		List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList
					.add((ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) extension
							.getValue());
		}
		return returnList;
	}

   public IQICoreProcedure setApproachBodySite(List<ResourceReferenceDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/procedure-approachBodySite",
                        (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) param
                              .get(index));
         }
      }
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreProcedure setEncounterResource(QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreProcedure setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreProcedure setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }
}