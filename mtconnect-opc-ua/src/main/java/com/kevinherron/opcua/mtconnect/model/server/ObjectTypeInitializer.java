package com.kevinherron.opcua.mtconnect.model.server;

import com.kevinherron.opcua.mtconnect.model.server.objects.AScaleSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AbsoluteSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AccelerationClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AccumulatedTimeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ActionSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ActualSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ActuatorClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ActuatorStateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ActuatorTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AllSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AlternatingSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AmperageClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AngleClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AngularAccelerationClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AngularVelocityClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AssetChangedClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AssetRemovedClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AuxiliariesTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AuxiliarySubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AvailabilityClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AxesTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AxisCouplingClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AxisFeedrateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AxisFeedrateOverrideClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AxisInterlockClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.AxisStateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.BScaleSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.BadSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.BarFeederInterfaceTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.BarFeederTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.BlockClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.BlockCountClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.BrinellSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CScaleSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ChuckInterfaceTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ChuckInterlockClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ChuckStateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ChuckTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ClockTimeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CloseChuckClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CloseDoorClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CommandedSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CommunicationsClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CompositionStateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ConcentrationClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ConductivityClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ControlSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ControllerModeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ControllerModeOverrideClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ControllerTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CoolantTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.CoupledAxesClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DScaleSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DataRangeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DelaySubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DielectricTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DirectSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DirectionClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DisplacementClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DoorInterfaceTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DoorStateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DoorTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.DryRunSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ElectricTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ElectricalEnergyClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.EmergencyStopClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.EnclosureTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.EndOfBarClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.EnvironmentalTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.EquipmentModeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.EquipmentTimerClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ExecutionClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.FeederTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.FillLevelClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.FixtureSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.FlowClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.FrequencyClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.FunctionalModeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.GoodSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.HardnessClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.HardwareClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.HydraulicTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.IncrementalSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.InterfaceStateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.InterfacesTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.JobSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.KineticSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LateralSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LeebSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LengthClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LengthSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LineClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LineLabelClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LineNumberClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LineSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LinearForceClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LinearSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LinearTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LoadClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LoadedSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LoaderTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LogicProgramClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.LubricationTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTChannelTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTComponentTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTCompositionTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTConditionClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTConditionEventTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTConditionTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTConfigurationTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTConstraintTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTControlledVocabEventClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTDataItemClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTDataItemSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTDescriptionTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTDeviceTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTEventClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTMessageClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTMessageEventTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTNumericEventClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTSampleClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTSensorConfigurationTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MTStringEventClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MachineAxisLockSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaintenanceSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ManualUnclampSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MassClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialChangeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialFeedClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialHandlerInterfaceTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialLoadClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialRetractClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialUnloadClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaterialsTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MaximumSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MessageClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MinimumSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MohsSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MoleSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MotionProgramClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.MotionSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.NoScaleSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.OpenChuckClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.OpenDoorClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.OperatingSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.OperatorIdClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.OperatorSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.OptionalStopSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.OverrideSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PHClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PalletIdClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PartChangeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PartCountClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PartIdClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PartNumberClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PathFeedrateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PathFeedrateOverrideClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PathModeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PathPositionClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PathTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PersonnelTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PneumaticTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PositionClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PowerFactorClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PowerStateClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PoweredSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PressureClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.PrimarySubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProbeSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProcessPowerTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProcessSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProcessTimerClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProgramClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProgramCommentClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProgramEditClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProgramEditNameClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProgramHeaderClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProgrammedSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ProtectiveTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RadialSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RapidSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RelativeSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RemainingSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RequestSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ResistenceClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ResourcesTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ResponseSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RockwellSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RotaryModeClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RotarySubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RotaryTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RotaryVelocityClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.RotaryVelocityOverrideClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SensorTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SerialNumberClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SetUpSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ShoreSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SoundLevelClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SpindleInterlockClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.StandardSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.StockTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.StrainClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SwitchedSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SystemClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.SystemsTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.TargetSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.TemperatureClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.TensionClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.TiltClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolAssetIdClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolChangeStopSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolEdgeSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolGroupSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolNumberClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolOffsetClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ToolingDeliveryTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.TorqueClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.UasbleSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.UserClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.VelocityClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.VerticalSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.VickersSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.ViscosityClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.VoltAmpereClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.VoltAmpereReactiveClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.VoltageClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.VolumeSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WasteDisposalTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WattageClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WeightSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WireClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WorkOffsetClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WorkholdingClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WorkingSubClassTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.objects.WorkpieceSubClassTypeNode;
import org.eclipse.milo.opcua.sdk.server.ObjectTypeManager;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

public class ObjectTypeInitializer {
  public static void initialize(
      NamespaceTable namespaceTable, ObjectTypeManager objectTypeManager) {
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=4326")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTConditionEventTypeNode.class,
        MTConditionEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2656")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTMessageEventTypeNode.class,
        MTMessageEventTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2425")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTDataItemClassTypeNode.class,
        MTDataItemClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2629")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTConditionClassTypeNode.class,
        MTConditionClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2411")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ActuatorClassTypeNode.class,
        ActuatorClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2413")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CommunicationsClassTypeNode.class,
        CommunicationsClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2415")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DataRangeClassTypeNode.class,
        DataRangeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2419")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        HardwareClassTypeNode.class,
        HardwareClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2417")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LogicProgramClassTypeNode.class,
        LogicProgramClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2421")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MotionProgramClassTypeNode.class,
        MotionProgramClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2423")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SystemClassTypeNode.class,
        SystemClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2631")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTEventClassTypeNode.class,
        MTEventClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2427")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTMessageClassTypeNode.class,
        MTMessageClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2144")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTControlledVocabEventClassTypeNode.class,
        MTControlledVocabEventClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2146")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ActuatorStateClassTypeNode.class,
        ActuatorStateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2149")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AvailabilityClassTypeNode.class,
        AvailabilityClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2152")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AxisCouplingClassTypeNode.class,
        AxisCouplingClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2155")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AxisInterlockClassTypeNode.class,
        AxisInterlockClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2158")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AxisStateClassTypeNode.class,
        AxisStateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2161")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ChuckInterlockClassTypeNode.class,
        ChuckInterlockClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2164")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ChuckStateClassTypeNode.class,
        ChuckStateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2256")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CloseChuckClassTypeNode.class,
        CloseChuckClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2250")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CloseDoorClassTypeNode.class,
        CloseDoorClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2173")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CompositionStateClassTypeNode.class,
        CompositionStateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2167")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ControllerModeClassTypeNode.class,
        ControllerModeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2176")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ControllerModeOverrideClassTypeNode.class,
        ControllerModeOverrideClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2179")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DirectionClassTypeNode.class,
        DirectionClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2182")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DoorStateClassTypeNode.class,
        DoorStateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2185")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        EmergencyStopClassTypeNode.class,
        EmergencyStopClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2188")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        EndOfBarClassTypeNode.class,
        EndOfBarClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2191")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        EquipmentModeClassTypeNode.class,
        EquipmentModeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2170")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ExecutionClassTypeNode.class,
        ExecutionClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2194")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        FunctionalModeClassTypeNode.class,
        FunctionalModeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2227")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        InterfaceStateClassTypeNode.class,
        InterfaceStateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2235")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialChangeClassTypeNode.class,
        MaterialChangeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2231")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialFeedClassTypeNode.class,
        MaterialFeedClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2241")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialLoadClassTypeNode.class,
        MaterialLoadClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2238")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialRetractClassTypeNode.class,
        MaterialRetractClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2244")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialUnloadClassTypeNode.class,
        MaterialUnloadClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2253")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        OpenChuckClassTypeNode.class,
        OpenChuckClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2247")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        OpenDoorClassTypeNode.class,
        OpenDoorClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2259")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PartChangeClassTypeNode.class,
        PartChangeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2215")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PathModeClassTypeNode.class,
        PathModeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2218")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PowerStateClassTypeNode.class,
        PowerStateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2221")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProgramEditClassTypeNode.class,
        ProgramEditClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2224")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RotaryModeClassTypeNode.class,
        RotaryModeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2212")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SpindleInterlockClassTypeNode.class,
        SpindleInterlockClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2359")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTNumericEventClassTypeNode.class,
        MTNumericEventClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2347")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AxisFeedrateOverrideClassTypeNode.class,
        AxisFeedrateOverrideClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2349")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        BlockCountClassTypeNode.class,
        BlockCountClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2351")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        HardnessClassTypeNode.class,
        HardnessClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2353")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LineNumberClassTypeNode.class,
        LineNumberClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2355")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PartCountClassTypeNode.class,
        PartCountClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=3628")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PathFeedrateOverrideClassTypeNode.class,
        PathFeedrateOverrideClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2357")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RotaryVelocityOverrideClassTypeNode.class,
        RotaryVelocityOverrideClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2361")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTStringEventClassTypeNode.class,
        MTStringEventClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2405")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AssetChangedClassTypeNode.class,
        AssetChangedClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2407")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AssetRemovedClassTypeNode.class,
        AssetRemovedClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2363")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        BlockClassTypeNode.class,
        BlockClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2365")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CoupledAxesClassTypeNode.class,
        CoupledAxesClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2409")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LineClassTypeNode.class,
        LineClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2367")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LineLabelClassTypeNode.class,
        LineLabelClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2369")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialClassTypeNode.class,
        MaterialClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2403")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MessageClassTypeNode.class,
        MessageClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2371")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        OperatorIdClassTypeNode.class,
        OperatorIdClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2373")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PalletIdClassTypeNode.class,
        PalletIdClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2375")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PartIdClassTypeNode.class,
        PartIdClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2377")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PartNumberClassTypeNode.class,
        PartNumberClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2379")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProgramClassTypeNode.class,
        ProgramClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2385")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProgramCommentClassTypeNode.class,
        ProgramCommentClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2381")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProgramEditNameClassTypeNode.class,
        ProgramEditNameClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2383")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProgramHeaderClassTypeNode.class,
        ProgramHeaderClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2387")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SerialNumberClassTypeNode.class,
        SerialNumberClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2389")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolAssetIdClassTypeNode.class,
        ToolAssetIdClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2391")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolNumberClassTypeNode.class,
        ToolNumberClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2393")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolOffsetClassTypeNode.class,
        ToolOffsetClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2395")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        UserClassTypeNode.class,
        UserClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2397")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WireClassTypeNode.class,
        WireClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2399")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WorkholdingClassTypeNode.class,
        WorkholdingClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2401")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WorkOffsetClassTypeNode.class,
        WorkOffsetClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2345")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTSampleClassTypeNode.class,
        MTSampleClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2265")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AccelerationClassTypeNode.class,
        AccelerationClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2267")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AccumulatedTimeClassTypeNode.class,
        AccumulatedTimeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2273")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AmperageClassTypeNode.class,
        AmperageClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2275")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AngleClassTypeNode.class,
        AngleClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2269")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AngularAccelerationClassTypeNode.class,
        AngularAccelerationClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2271")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AngularVelocityClassTypeNode.class,
        AngularVelocityClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2277")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AxisFeedrateClassTypeNode.class,
        AxisFeedrateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2279")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ClockTimeClassTypeNode.class,
        ClockTimeClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2281")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ConcentrationClassTypeNode.class,
        ConcentrationClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2283")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ConductivityClassTypeNode.class,
        ConductivityClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2285")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DisplacementClassTypeNode.class,
        DisplacementClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2287")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ElectricalEnergyClassTypeNode.class,
        ElectricalEnergyClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2289")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        EquipmentTimerClassTypeNode.class,
        EquipmentTimerClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2291")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        FillLevelClassTypeNode.class,
        FillLevelClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2293")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        FlowClassTypeNode.class,
        FlowClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2295")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        FrequencyClassTypeNode.class,
        FrequencyClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2297")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LengthClassTypeNode.class,
        LengthClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2299")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LinearForceClassTypeNode.class,
        LinearForceClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2263")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LoadClassTypeNode.class,
        LoadClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2301")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MassClassTypeNode.class,
        MassClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2303")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PathFeedrateClassTypeNode.class,
        PathFeedrateClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2305")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PathPositionClassTypeNode.class,
        PathPositionClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2307")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PHClassTypeNode.class,
        PHClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2309")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PositionClassTypeNode.class,
        PositionClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2311")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PowerFactorClassTypeNode.class,
        PowerFactorClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2313")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PressureClassTypeNode.class,
        PressureClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2315")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProcessTimerClassTypeNode.class,
        ProcessTimerClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2317")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ResistenceClassTypeNode.class,
        ResistenceClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2319")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RotaryVelocityClassTypeNode.class,
        RotaryVelocityClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2321")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SoundLevelClassTypeNode.class,
        SoundLevelClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2323")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        StrainClassTypeNode.class,
        StrainClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2325")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        TemperatureClassTypeNode.class,
        TemperatureClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2327")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        TensionClassTypeNode.class,
        TensionClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2329")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        TiltClassTypeNode.class,
        TiltClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2331")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        TorqueClassTypeNode.class,
        TorqueClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2335")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        VelocityClassTypeNode.class,
        VelocityClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2339")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ViscosityClassTypeNode.class,
        ViscosityClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2341")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        VoltageClassTypeNode.class,
        VoltageClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2333")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        VoltAmpereClassTypeNode.class,
        VoltAmpereClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2337")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        VoltAmpereReactiveClassTypeNode.class,
        VoltAmpereReactiveClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2343")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WattageClassTypeNode.class,
        WattageClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2476")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTDataItemSubClassTypeNode.class,
        MTDataItemSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2478")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AbsoluteSubClassTypeNode.class,
        AbsoluteSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2482")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ActionSubClassTypeNode.class,
        ActionSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2480")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ActualSubClassTypeNode.class,
        ActualSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2484")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AllSubClassTypeNode.class,
        AllSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2486")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AlternatingSubClassTypeNode.class,
        AlternatingSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2488")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AScaleSubClassTypeNode.class,
        AScaleSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2490")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AuxiliarySubClassTypeNode.class,
        AuxiliarySubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2492")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        BadSubClassTypeNode.class,
        BadSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2494")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        BrinellSubClassTypeNode.class,
        BrinellSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2496")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        BScaleSubClassTypeNode.class,
        BScaleSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2498")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CommandedSubClassTypeNode.class,
        CommandedSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2502")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ControlSubClassTypeNode.class,
        ControlSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2504")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CScaleSubClassTypeNode.class,
        CScaleSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2506")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DelaySubClassTypeNode.class,
        DelaySubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2508")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DirectSubClassTypeNode.class,
        DirectSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2510")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DryRunSubClassTypeNode.class,
        DryRunSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2512")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DScaleSubClassTypeNode.class,
        DScaleSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2514")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        FixtureSubClassTypeNode.class,
        FixtureSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2500")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        GoodSubClassTypeNode.class,
        GoodSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2516")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        IncrementalSubClassTypeNode.class,
        IncrementalSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2518")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        JobSubClassTypeNode.class,
        JobSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2520")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        KineticSubClassTypeNode.class,
        KineticSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2522")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LateralSubClassTypeNode.class,
        LateralSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2524")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LeebSubClassTypeNode.class,
        LeebSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2526")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LengthSubClassTypeNode.class,
        LengthSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2528")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LinearSubClassTypeNode.class,
        LinearSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2530")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LineSubClassTypeNode.class,
        LineSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2532")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LoadedSubClassTypeNode.class,
        LoadedSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2534")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MachineAxisLockSubClassTypeNode.class,
        MachineAxisLockSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2536")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaintenanceSubClassTypeNode.class,
        MaintenanceSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2538")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ManualUnclampSubClassTypeNode.class,
        ManualUnclampSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2540")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaximumSubClassTypeNode.class,
        MaximumSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2542")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MinimumSubClassTypeNode.class,
        MinimumSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2544")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MohsSubClassTypeNode.class,
        MohsSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2546")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MoleSubClassTypeNode.class,
        MoleSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2548")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MotionSubClassTypeNode.class,
        MotionSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2550")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        NoScaleSubClassTypeNode.class,
        NoScaleSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2552")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        OperatingSubClassTypeNode.class,
        OperatingSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2554")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        OperatorSubClassTypeNode.class,
        OperatorSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2556")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        OptionalStopSubClassTypeNode.class,
        OptionalStopSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2558")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        OverrideSubClassTypeNode.class,
        OverrideSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2562")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PoweredSubClassTypeNode.class,
        PoweredSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2560")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PrimarySubClassTypeNode.class,
        PrimarySubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2564")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProbeSubClassTypeNode.class,
        ProbeSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2566")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProcessSubClassTypeNode.class,
        ProcessSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2568")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProgrammedSubClassTypeNode.class,
        ProgrammedSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2570")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RadialSubClassTypeNode.class,
        RadialSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2572")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RapidSubClassTypeNode.class,
        RapidSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2574")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RelativeSubClassTypeNode.class,
        RelativeSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2576")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RemainingSubClassTypeNode.class,
        RemainingSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2578")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RequestSubClassTypeNode.class,
        RequestSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2580")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ResponseSubClassTypeNode.class,
        ResponseSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2582")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RockwellSubClassTypeNode.class,
        RockwellSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2584")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RotarySubClassTypeNode.class,
        RotarySubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2586")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SetUpSubClassTypeNode.class,
        SetUpSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2588")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ShoreSubClassTypeNode.class,
        ShoreSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2590")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        StandardSubClassTypeNode.class,
        StandardSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2592")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SwitchedSubClassTypeNode.class,
        SwitchedSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2594")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        TargetSubClassTypeNode.class,
        TargetSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2596")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolChangeStopSubClassTypeNode.class,
        ToolChangeStopSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2598")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolEdgeSubClassTypeNode.class,
        ToolEdgeSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2600")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolGroupSubClassTypeNode.class,
        ToolGroupSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2602")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolSubClassTypeNode.class,
        ToolSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2604")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        UasbleSubClassTypeNode.class,
        UasbleSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2606")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        VerticalSubClassTypeNode.class,
        VerticalSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2610")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        VickersSubClassTypeNode.class,
        VickersSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2608")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        VolumeSubClassTypeNode.class,
        VolumeSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2612")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WeightSubClassTypeNode.class,
        WeightSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2614")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WorkingSubClassTypeNode.class,
        WorkingSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2616")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WorkpieceSubClassTypeNode.class,
        WorkpieceSubClassTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2059")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTChannelTypeNode.class,
        MTChannelTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2021")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTComponentTypeNode.class,
        MTComponentTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2015")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTDeviceTypeNode.class,
        MTDeviceTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2074")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ActuatorTypeNode.class,
        ActuatorTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2076")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AuxiliariesTypeNode.class,
        AuxiliariesTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2082")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        BarFeederTypeNode.class,
        BarFeederTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2102")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        EnvironmentalTypeNode.class,
        EnvironmentalTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2112")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LoaderTypeNode.class,
        LoaderTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2134")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SensorTypeNode.class,
        SensorTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2140")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ToolingDeliveryTypeNode.class,
        ToolingDeliveryTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2142")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        WasteDisposalTypeNode.class,
        WasteDisposalTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2078")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        AxesTypeNode.class,
        AxesTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2110")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LinearTypeNode.class,
        LinearTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2132")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        RotaryTypeNode.class,
        RotaryTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2086")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ChuckTypeNode.class,
        ChuckTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2088")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ControllerTypeNode.class,
        ControllerTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2120")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PathTypeNode.class,
        PathTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2096")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DoorTypeNode.class,
        DoorTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2108")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        InterfacesTypeNode.class,
        InterfacesTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2080")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        BarFeederInterfaceTypeNode.class,
        BarFeederInterfaceTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2084")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ChuckInterfaceTypeNode.class,
        ChuckInterfaceTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2094")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DoorInterfaceTypeNode.class,
        DoorInterfaceTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2116")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialHandlerInterfaceTypeNode.class,
        MaterialHandlerInterfaceTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2130")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ResourcesTypeNode.class,
        ResourcesTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2118")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MaterialsTypeNode.class,
        MaterialsTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2136")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        StockTypeNode.class,
        StockTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2122")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PersonnelTypeNode.class,
        PersonnelTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2138")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        SystemsTypeNode.class,
        SystemsTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2090")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        CoolantTypeNode.class,
        CoolantTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2092")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        DielectricTypeNode.class,
        DielectricTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2098")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ElectricTypeNode.class,
        ElectricTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2100")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        EnclosureTypeNode.class,
        EnclosureTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2104")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        FeederTypeNode.class,
        FeederTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2106")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        HydraulicTypeNode.class,
        HydraulicTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2114")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        LubricationTypeNode.class,
        LubricationTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2124")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        PneumaticTypeNode.class,
        PneumaticTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2126")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProcessPowerTypeNode.class,
        ProcessPowerTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2128")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        ProtectiveTypeNode.class,
        ProtectiveTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2067")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTCompositionTypeNode.class,
        MTCompositionTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2044")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTConfigurationTypeNode.class,
        MTConfigurationTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2046")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTSensorConfigurationTypeNode.class,
        MTSensorConfigurationTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2053")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTDescriptionTypeNode.class,
        MTDescriptionTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2647")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTConstraintTypeNode.class,
        MTConstraintTypeNode::new);
    objectTypeManager.registerObjectType(
        NodeId.parse("ns=1;i=2660")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTConditionTypeNode.class,
        MTConditionTypeNode::new);
  }
}
