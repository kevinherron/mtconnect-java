# MTConnect

## Code Generation 
Run `mvn clean generate-sources` to generate the JAXB code.

## Examples
### MTConnectDevices
See `Probe.java`

### MTConnectStreams
See `Current.java` and `Sample.java`

### MTConnectAssets
See `Assets.java`

## Example Probe Output
Against https://demo.mtconnect.org/probe
```
--- Header Information ---
Version: 2.2.0.502
Creation Time: 2025-04-13T00:19:51Z
Instance ID: 1743558962
Sender: IntelAgent
Buffer Size: 131072
Asset Buffer Size: 1024
Asset Count: 67
Device Model Change Time: 2025-04-02T01:56:02.098850Z
Test Indicator: null

--- Devices Information ---

--- Agent Information ---
UUID: f9db9832-db0c-5781-bb06-a6eaf14d0434
Name: Agent
MTConnect Version: 2.0
ID: agent_f9db9832
Components:
  Component ID: __adapters__
  Sub-Components:
    Component ID: _1b99d6086a
    Data Items: 6
    Component ID: _f63289ad53
    Data Items: 6

--- Device List ---
UUID: OKUMA.123456
Name: OKUMA
MTConnect Version: null
ID: OKUMA.123456
Components:
  Component ID: struct
  Sub-Components:
    Component ID: x_axis
    Component ID: y_axis
    Component ID: z1_axis
    Component ID: z4_axis
    Component ID: b_axis
    Component ID: c1_axis
    Component ID: c2_axis
  Component ID: Laxes1
  Sub-Components:
    Component ID: Lx1
    Data Items: 3
    Component ID: LYI1
    Native Name: Y
    Data Items: 3
    Component ID: Lz1
    Data Items: 3
    Component ID: Lb1
    Native Name: BA
    Data Items: 3
    Component ID: Lc1
    Native Name: S
    Data Items: 7
    Component ID: Lz4
    Native Name: WA
    Data Items: 3
    Component ID: Lc2
    Native Name: S
    Data Items: 7
    Component ID: Lc3
    Native Name: CA
    Data Items: 4
    Component ID: Lc6
    Native Name: SA
    Data Items: 5
  Component ID: Lct1
  Data Items: 40
  Sub-Components:
    Component ID: Lp1
    Data Items: 12
  Component ID: LSystems1
  Sub-Components:
    Component ID: LCoolantSystem1
    Data Items: 1
    Component ID: LElectricSystem1
    Data Items: 1
    Component ID: LHydraulicSystem1
    Data Items: 1
    Component ID: LLubricationSystem1
    Data Items: 1
    Component ID: LPneumaticSystem1
    Data Items: 1
  Component ID: LAux1
  Sub-Components:
    Component ID: LLoaderSystem1
    Data Items: 1
    Component ID: LWasteDisposalSystem1
    Data Items: 1
    Component ID: LToolingDeliverySystem1
    Data Items: 1
    Component ID: LBarFeederSystem1
    Data Items: 1
  Component ID: resources
  Sub-Components:
    Component ID: personnel
    Data Items: 3
  Component ID: enclosure
  Data Items: 1
UUID: Mazak
Name: Mazak
MTConnect Version: null
ID: d1
Components:
  Component ID: mstruct
  Sub-Components:
    Component ID: xaxism
    Component ID: yaxism
    Component ID: zaxis
    Component ID: table
    Component ID: trundle
  Component ID: a
  Data Items: 2
  Sub-Components:
    Component ID: x
    Native Name: X
    Data Items: 7
    Component ID: y
    Native Name: Y
    Data Items: 7
    Component ID: z
    Native Name: Z
    Data Items: 7
    Component ID: c
    Native Name: S
    Data Items: 6
    Component ID: br
    Native Name: B
    Data Items: 7
    Component ID: c2
    Native Name: C
    Data Items: 9
  Component ID: cont
  Data Items: 10
  Sub-Components:
    Component ID: path1
    Data Items: 34
  Component ID: door1
  Data Items: 1
  Component ID: parts
  Sub-Components:
    Component ID: partocc
    Data Items: 4
  Component ID: systems
  Sub-Components:
    Component ID: elec
    Data Items: 1
    Component ID: hydraulic
    Data Items: 1
    Component ID: coolant
    Data Items: 3
    Component ID: pneumatic
    Data Items: 1
    Component ID: lubrication
    Data Items: 2
  Component ID: Aux
  Sub-Components:
    Component ID: room
    Data Items: 1
  Component ID: resourcesm
  Sub-Components:
    Component ID: personnelm
    Data Items: 1
    Component ID: materials
    Sub-Components:
      Component ID: procstock
      Data Items: 1
  Component ID: enclosurem
  Data Items: 1
```
