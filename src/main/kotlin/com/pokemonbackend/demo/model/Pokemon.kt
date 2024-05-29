package com.pokemonbackend.demo.model

data class Pokemon (
    val abilities: List<Ability>? = null,
    val baseExperience: Long? = null,
    val cries: Cries? = null,
    val forms: List<Species>? = null,
    val gameIndices: List<GameIndex>? = null,
    val height: Long? = null,
    val heldItems: List<HeldItem>? = null,
    val id: Long? = null,
    val isDefault: Boolean? = null,
    val locationAreaEncounters: String? = null,
    val moves: List<Move>? = null,
    val name: String? = null,
    val order: Long? = null,
    val pastAbilities: List<Any?>? = null,
    val pastTypes: List<Any?>? = null,
    val species: Species? = null,
    val sprites: Sprites? = null,
    val stats: List<Stat>? = null,
    val types: List<Type>? = null,
    val weight: Long? = null
)

data class Ability (
    val ability: Species? = null,
    val isHidden: Boolean? = null,
    val slot: Long? = null
)

data class Species (
    val name: String? = null,
    val url: String? = null
)

data class Cries (
    val latest: String? = null,
    val legacy: String? = null
)

data class GameIndex (
    val gameIndex: Long? = null,
    val version: Species? = null
)

data class HeldItem (
    val item: Species? = null,
    val versionDetails: List<VersionDetail>? = null
)

data class VersionDetail (
    val rarity: Long? = null,
    val version: Species? = null
)

data class Move (
    val move: Species? = null,
    val versionGroupDetails: List<VersionGroupDetail>? = null
)

data class VersionGroupDetail (
    val levelLearnedAt: Long? = null,
    val moveLearnMethod: Species? = null,
    val versionGroup: Species? = null
)

data class GenerationV (
    val blackWhite: Sprites? = null
)

data class GenerationIv (
    val diamondPearl: Sprites? = null,
    val heartgoldSoulsilver: Sprites? = null,
    val platinum: Sprites? = null
)

data class Versions (
    val generationI: GenerationI? = null,
    val generationIi: GenerationIi? = null,
    val generationIii: GenerationIii? = null,
    val generationIv: GenerationIv? = null,
    val generationV: GenerationV? = null,
    val generationVi: Map<String, Home>? = null,
    val generationVii: GenerationVii? = null,
    val generationViii: GenerationViii? = null
)

data class Other (
    val dreamWorld: DreamWorld? = null,
    val home: Home? = null,
    val officialArtwork: OfficialArtwork? = null,
    val showdown: Sprites? = null
)

data class Sprites (
    val backDefault: String? = null,
    val backFemale: Any? = null,
    val backShiny: String? = null,
    val backShinyFemale: Any? = null,
    val frontDefault: String? = null,
    val frontFemale: Any? = null,
    val frontShiny: String? = null,
    val frontShinyFemale: Any? = null,
    val other: Other? = null,
    val versions: Versions? = null,
    val animated: Sprites? = null
)

data class GenerationI (
    val redBlue: RedBlue? = null,
    val yellow: RedBlue? = null
)

data class RedBlue (
    val backDefault: String? = null,
    val backGray: String? = null,
    val backTransparent: String? = null,
    val frontDefault: String? = null,
    val frontGray: String? = null,
    val frontTransparent: String? = null
)

data class GenerationIi (
    val crystal: Crystal? = null,
    val gold: Gold? = null,
    val silver: Gold? = null
)

data class Crystal (
    val backDefault: String? = null,
    val backShiny: String? = null,
    val backShinyTransparent: String? = null,
    val backTransparent: String? = null,
    val frontDefault: String? = null,
    val frontShiny: String? = null,
    val frontShinyTransparent: String? = null,
    val frontTransparent: String? = null
)

data class Gold (
    val backDefault: String? = null,
    val backShiny: String? = null,
    val frontDefault: String? = null,
    val frontShiny: String? = null,
    val frontTransparent: String? = null
)

data class GenerationIii (
    val emerald: OfficialArtwork? = null,
    val fireredLeafgreen: Gold? = null,
    val rubySapphire: Gold? = null
)

data class OfficialArtwork (
    val frontDefault: String? = null,
    val frontShiny: String? = null
)

data class Home (
    val frontDefault: String? = null,
    val frontFemale: Any? = null,
    val frontShiny: String? = null,
    val frontShinyFemale: Any? = null
)

data class GenerationVii (
    val icons: DreamWorld? = null,
    val ultraSunUltraMoon: Home? = null
)

data class DreamWorld (
    val frontDefault: String? = null,
    val frontFemale: Any? = null
)

data class GenerationViii (
    val icons: DreamWorld? = null
)

data class Stat (
    val baseStat: Long? = null,
    val effort: Long? = null,
    val stat: Species? = null
)

data class Type (
    val slot: Long? = null,
    val type: Species? = null
)
