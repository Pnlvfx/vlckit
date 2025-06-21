import { View, StyleSheet } from 'react-native';
import { VLCPlayer } from 'react-native-vlckit';

export default function App() {
  return (
    <View style={styles.container}>
      <VLCPlayer color="red" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
